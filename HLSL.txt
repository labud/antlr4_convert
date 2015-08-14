
cbuffer VSBuffer{
	matrix gWVP;
	matrix gWorld;
};

struct VertexInputType{
	float3 Position : POSITION;
	float2 TexCoord : TEXCOORD0;
	float3 Normal : NORMAL;
};

struct PixelInputType{
	float4 gl_Position : SV_POSITION;
	float2 TexCoord0 : TEXCOORD0;
	float3 Normal0 : NORMAL;
	float3 WorldPos0 : POSITION;
};

PixelInputType main(VertexInputType input) {
	PixelInputType output;
	output.gl_Position = mul(float4(input.Position,1.0), gWVP);
	output.TexCoord0 = input.TexCoord;
	output.Normal0 = mul(float4(input.Normal,0.0), gWorld).xyz;
	output.WorldPos0 = mul(float4(input.Position,1.0), gWorld).xyz;
	return output ;
}
