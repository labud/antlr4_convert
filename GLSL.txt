#version 330

uniform mat4x4 gWVP;
uniform mat4x4 gWorld;


struct VertexInputType{
	vec3 Position;
	vec2 TexCoord;
	vec3 Normal;
};

in vec3 Position;
in vec2 TexCoord;
in vec3 Normal;

VertexInputType getVertexInputType()
{
	VertexInputType tmp;
	tmp.Position = Position;
	tmp.TexCoord = TexCoord;
	tmp.Normal = Normal;
	return tmp;
}


struct PixelInputType{
	vec4 gl_Position;
	vec2 TexCoord0;
	vec3 Normal0;
	vec3 WorldPos0;
};

out vec4 gl_Position;
out vec2 TexCoord0;
out vec3 Normal0;
out vec3 WorldPos0;

void setPixelInputType(PixelInputType tmp)
{
	gl_Position = tmp.gl_Position;
	TexCoord0 = tmp.TexCoord0;
	Normal0 = tmp.Normal0;
	WorldPos0 = tmp.WorldPos0;
}


void main() {
	VertexInputType input = getVertexInputType();
	PixelInputType output;
	output.gl_Position = (gWVP * vec4(input.Position, 1.0));
	output.TexCoord0 = input.TexCoord;
	output.Normal0 = (gWorld * vec4(input.Normal, 0.0)).xyz;
	output.WorldPos0 = (gWorld * vec4(input.Position, 1.0)).xyz;
	setPixelInputType(output);
}
