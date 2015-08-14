package MidSL;

import java.util.*;

/**
 * Created by gzlongyue on 2015/8/14.
 */

//该函数将MidSL中的typeSpecifier转化成GLSL或者HLSL中对应的type_specifier
public class TypeSpecifierCorvertor {

    Map<String, String> GLSL;

    Map<String, String> HLSL;

    TypeSpecifierCorvertor(){
        initGLSLMap();
        initHLSLMap();
    }

    void initGLSLMap() {
        GLSL = new HashMap<>();
        for(int i = 0 ; i < GLSLtype.length; i += 2){
            GLSL.put(GLSLtype[i], GLSLtype[i+1]);
        }
    }

    void initHLSLMap() {
        HLSL = new HashMap<>();
        for(int i = 0 ; i < HLSLtype.length; i += 2){
            HLSL.put(HLSLtype[i], HLSLtype[i+1]);
        }
    }


    String toGLSL(String midType){
        if(GLSL.containsKey(midType))
            return GLSL.get(midType);
        return midType;
    }

    String toHLSL(String midType){
        if(HLSL.containsKey(midType))
            return HLSL.get(midType);
        return midType;
    }

    String[] GLSLtype = new String[]{
            //SCALA_TYPE
            "int", "int",
            "bool", "bool",
            "float", "float",
            "double", "double",

            //VECTOR_TYPE
            "int2", "ivec2",
            "int3", "ivec3",
            "int4", "ivec4",

            "bool2", "bvec2",
            "bool3", "bvec3",
            "bool4", "bvec4",

            "float2", "vec2",
            "float3", "vec3",
            "float4", "vec4",

            "double2", "dvec2",
            "double3", "dvec3",
            "double4", "dvec4",

            "vector", "vec4",

            //MATRIX_TYPE
            "bool2x2", "mat2x2",
            "bool2x3", "mat2x3",
            "bool2x4", "mat2x4",
            "bool3x2", "mat3x2",
            "bool3x3", "mat3x3",
            "bool3x4", "mat3x4",
            "bool4x2", "mat4x2",
            "bool4x3", "mat4x3",
            "bool4x4", "mat4x4",

            "int2x2", "mat2x2",
            "int2x3", "mat2x3",
            "int2x4", "mat2x4",
            "int3x2", "mat3x2",
            "int3x3", "mat3x3",
            "int3x4", "mat3x4",
            "int4x2", "mat4x2",
            "int4x3", "mat4x3",
            "int4x4", "mat4x4",

            "float2x2", "mat2x2",
            "float2x3", "mat2x3",
            "float2x4", "mat2x4",
            "float3x2", "mat3x2",
            "float3x3", "mat3x3",
            "float3x4", "mat3x4",
            "float4x2", "mat4x2",
            "float4x3", "mat4x3",
            "float4x4", "mat4x4",

            "double2x2", "dmat2x2",
            "double2x3", "dmat2x3",
            "double2x4", "dmat2x4",
            "double3x2", "dmat3x2",
            "double3x3", "dmat3x3",
            "double3x4", "dmat3x4",
            "double4x2", "dmat4x2",
            "double4x3", "dmat4x3",
            "double4x4", "dmat4x4",

            "matrix", "mat4x4"
    };

    String[] HLSLtype = new String[]{};
}

