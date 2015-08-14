#version 330

cbuffer VSBuffer
{
	matrix gWVP;
	matrix gWorld;
};

inbuffer VertexInputType
{
    float3 Position : POSITION;
    float2 TexCoord : TEXCOORD0;
	float3 Normal : NORMAL;
};

outbuffer PixelInputType{
	float4 gl_Position : SV_POSITION;
	float2 TexCoord0 : TEXCOORD0;
	float3 Normal0 : NORMAL;
	float3 WorldPos0 : POSITION;
};

PixelInputType main(VertexInputType input)
{
	PixelInputType output;

    output.gl_Position = MATMUL(gWVP, float4(input.Position, 1.0));
    output.TexCoord0 = input.TexCoord;
    output.Normal0 =  MATMUL(gWorld, float4(input.Normal, 0.0)).xyz;
    output.WorldPos0   = MATMUL(gWorld, float4(input.Position, 1.0)).xyz;

	return output;
}

