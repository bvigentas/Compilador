package br.furb.analisador_lexico;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        84,
        84,
        85,
        276,
        277,
        278,
        278,
        278,
        278,
        279,
        279,
        280,
        280,
        280,
        280,
        291,
        291,
        291,
        292,
        293,
        294,
        331,
        334,
        334,
        397,
        397,
        397,
        588,
        780,
        780,
        780,
        790,
        801,
        801,
        801,
        801,
        864,
        864,
        901,
        1094,
        1104,
        1296,
        1488,
        1498,
        1498
    };

    int[][] SCANNER_TABLE = 
    {
        {9, 1},
        {10, 1},
        {32, 1},
        {33, 2},
        {34, 3},
        {35, 4},
        {38, 5},
        {40, 6},
        {41, 7},
        {42, 8},
        {43, 9},
        {44, 10},
        {45, 11},
        {46, 12},
        {47, 13},
        {48, 14},
        {49, 15},
        {50, 15},
        {51, 15},
        {52, 15},
        {53, 15},
        {54, 15},
        {55, 15},
        {56, 15},
        {57, 15},
        {58, 16},
        {59, 17},
        {60, 18},
        {61, 19},
        {62, 20},
        {65, 21},
        {66, 21},
        {67, 21},
        {68, 21},
        {69, 21},
        {70, 21},
        {71, 21},
        {72, 21},
        {73, 21},
        {74, 21},
        {75, 21},
        {76, 21},
        {77, 21},
        {78, 21},
        {79, 21},
        {80, 21},
        {81, 21},
        {82, 21},
        {83, 21},
        {84, 21},
        {85, 21},
        {86, 21},
        {87, 21},
        {88, 21},
        {89, 21},
        {90, 21},
        {92, 22},
        {94, 23},
        {97, 24},
        {98, 24},
        {99, 24},
        {100, 24},
        {101, 24},
        {102, 24},
        {103, 24},
        {104, 24},
        {105, 24},
        {106, 24},
        {107, 24},
        {108, 24},
        {109, 24},
        {110, 24},
        {111, 24},
        {112, 24},
        {113, 24},
        {114, 24},
        {115, 24},
        {116, 24},
        {117, 24},
        {118, 24},
        {119, 24},
        {120, 24},
        {121, 24},
        {122, 24},
        {61, 25},
        {9, 3},
        {13, 3},
        {32, 3},
        {33, 3},
        {34, 26},
        {35, 3},
        {36, 3},
        {37, 3},
        {38, 3},
        {39, 3},
        {40, 3},
        {41, 3},
        {42, 3},
        {43, 3},
        {44, 3},
        {45, 3},
        {46, 3},
        {47, 3},
        {48, 3},
        {49, 3},
        {50, 3},
        {51, 3},
        {52, 3},
        {53, 3},
        {54, 3},
        {55, 3},
        {56, 3},
        {57, 3},
        {58, 3},
        {59, 3},
        {60, 3},
        {61, 3},
        {62, 3},
        {63, 3},
        {64, 3},
        {65, 3},
        {66, 3},
        {67, 3},
        {68, 3},
        {69, 3},
        {70, 3},
        {71, 3},
        {72, 3},
        {73, 3},
        {74, 3},
        {75, 3},
        {76, 3},
        {77, 3},
        {78, 3},
        {79, 3},
        {80, 3},
        {81, 3},
        {82, 3},
        {83, 3},
        {84, 3},
        {85, 3},
        {86, 3},
        {87, 3},
        {88, 3},
        {89, 3},
        {90, 3},
        {91, 3},
        {93, 3},
        {94, 3},
        {95, 3},
        {96, 3},
        {97, 3},
        {98, 3},
        {99, 3},
        {100, 3},
        {101, 3},
        {102, 3},
        {103, 3},
        {104, 3},
        {105, 3},
        {106, 3},
        {107, 3},
        {108, 3},
        {109, 3},
        {110, 3},
        {111, 3},
        {112, 3},
        {113, 3},
        {114, 3},
        {115, 3},
        {116, 3},
        {117, 3},
        {118, 3},
        {119, 3},
        {120, 3},
        {121, 3},
        {122, 3},
        {123, 3},
        {124, 3},
        {125, 3},
        {126, 3},
        {161, 3},
        {162, 3},
        {163, 3},
        {164, 3},
        {165, 3},
        {166, 3},
        {167, 3},
        {168, 3},
        {169, 3},
        {170, 3},
        {171, 3},
        {172, 3},
        {173, 3},
        {174, 3},
        {175, 3},
        {176, 3},
        {177, 3},
        {178, 3},
        {179, 3},
        {180, 3},
        {181, 3},
        {182, 3},
        {183, 3},
        {184, 3},
        {185, 3},
        {186, 3},
        {187, 3},
        {188, 3},
        {189, 3},
        {190, 3},
        {191, 3},
        {192, 3},
        {193, 3},
        {194, 3},
        {195, 3},
        {196, 3},
        {197, 3},
        {198, 3},
        {199, 3},
        {200, 3},
        {201, 3},
        {202, 3},
        {203, 3},
        {204, 3},
        {205, 3},
        {206, 3},
        {207, 3},
        {208, 3},
        {209, 3},
        {210, 3},
        {211, 3},
        {212, 3},
        {213, 3},
        {214, 3},
        {215, 3},
        {216, 3},
        {217, 3},
        {218, 3},
        {219, 3},
        {220, 3},
        {221, 3},
        {222, 3},
        {223, 3},
        {224, 3},
        {225, 3},
        {226, 3},
        {227, 3},
        {228, 3},
        {229, 3},
        {230, 3},
        {231, 3},
        {232, 3},
        {233, 3},
        {234, 3},
        {235, 3},
        {236, 3},
        {237, 3},
        {238, 3},
        {239, 3},
        {240, 3},
        {241, 3},
        {242, 3},
        {243, 3},
        {244, 3},
        {245, 3},
        {246, 3},
        {247, 3},
        {248, 3},
        {249, 3},
        {250, 3},
        {251, 3},
        {252, 3},
        {253, 3},
        {254, 3},
        {255, 3},
        {124, 27},
        {38, 28},
        {61, 29},
        {61, 30},
        {46, 31},
        {48, 32},
        {49, 15},
        {50, 15},
        {51, 15},
        {52, 15},
        {53, 15},
        {54, 15},
        {55, 15},
        {56, 15},
        {57, 15},
        {61, 33},
        {61, 34},
        {61, 35},
        {48, 36},
        {49, 36},
        {50, 36},
        {51, 36},
        {52, 36},
        {53, 36},
        {54, 36},
        {55, 36},
        {56, 36},
        {57, 36},
        {95, 36},
        {97, 36},
        {98, 36},
        {99, 36},
        {100, 36},
        {101, 36},
        {102, 36},
        {103, 36},
        {104, 36},
        {105, 36},
        {106, 36},
        {107, 36},
        {108, 36},
        {109, 36},
        {110, 36},
        {111, 36},
        {112, 36},
        {113, 36},
        {114, 36},
        {115, 36},
        {116, 36},
        {117, 36},
        {118, 36},
        {119, 36},
        {120, 36},
        {121, 36},
        {122, 36},
        {110, 37},
        {115, 37},
        {116, 37},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {65, 38},
        {66, 38},
        {67, 38},
        {68, 38},
        {69, 38},
        {70, 38},
        {71, 38},
        {72, 38},
        {73, 38},
        {74, 38},
        {75, 38},
        {76, 38},
        {77, 38},
        {78, 38},
        {79, 38},
        {80, 38},
        {81, 38},
        {82, 38},
        {83, 38},
        {84, 38},
        {85, 38},
        {86, 38},
        {87, 38},
        {88, 38},
        {89, 38},
        {90, 38},
        {95, 24},
        {97, 24},
        {98, 24},
        {99, 24},
        {100, 24},
        {101, 24},
        {102, 24},
        {103, 24},
        {104, 24},
        {105, 24},
        {106, 24},
        {107, 24},
        {108, 24},
        {109, 24},
        {110, 24},
        {111, 24},
        {112, 24},
        {113, 24},
        {114, 24},
        {115, 24},
        {116, 24},
        {117, 24},
        {118, 24},
        {119, 24},
        {120, 24},
        {121, 24},
        {122, 24},
        {9, 39},
        {10, 39},
        {13, 39},
        {32, 39},
        {33, 39},
        {34, 39},
        {36, 39},
        {37, 39},
        {38, 39},
        {39, 39},
        {40, 39},
        {41, 39},
        {42, 39},
        {43, 39},
        {44, 39},
        {45, 39},
        {46, 39},
        {47, 39},
        {48, 39},
        {49, 39},
        {50, 39},
        {51, 39},
        {52, 39},
        {53, 39},
        {54, 39},
        {55, 39},
        {56, 39},
        {57, 39},
        {58, 39},
        {59, 39},
        {60, 39},
        {61, 39},
        {62, 39},
        {63, 39},
        {64, 39},
        {65, 39},
        {66, 39},
        {67, 39},
        {68, 39},
        {69, 39},
        {70, 39},
        {71, 39},
        {72, 39},
        {73, 39},
        {74, 39},
        {75, 39},
        {76, 39},
        {77, 39},
        {78, 39},
        {79, 39},
        {80, 39},
        {81, 39},
        {82, 39},
        {83, 39},
        {84, 39},
        {85, 39},
        {86, 39},
        {87, 39},
        {88, 39},
        {89, 39},
        {90, 39},
        {91, 39},
        {92, 39},
        {93, 39},
        {94, 39},
        {95, 39},
        {96, 39},
        {97, 39},
        {98, 39},
        {99, 39},
        {100, 39},
        {101, 39},
        {102, 39},
        {103, 39},
        {104, 39},
        {105, 39},
        {106, 39},
        {107, 39},
        {108, 39},
        {109, 39},
        {110, 39},
        {111, 39},
        {112, 39},
        {113, 39},
        {114, 39},
        {115, 39},
        {116, 39},
        {117, 39},
        {118, 39},
        {119, 39},
        {120, 39},
        {121, 39},
        {122, 39},
        {123, 39},
        {125, 39},
        {126, 39},
        {161, 39},
        {162, 39},
        {163, 39},
        {164, 39},
        {165, 39},
        {166, 39},
        {167, 39},
        {168, 39},
        {169, 39},
        {170, 39},
        {171, 39},
        {172, 39},
        {173, 39},
        {174, 39},
        {175, 39},
        {176, 39},
        {177, 39},
        {178, 39},
        {179, 39},
        {180, 39},
        {181, 39},
        {182, 39},
        {183, 39},
        {184, 39},
        {185, 39},
        {186, 39},
        {187, 39},
        {188, 39},
        {189, 39},
        {190, 39},
        {191, 39},
        {192, 39},
        {193, 39},
        {194, 39},
        {195, 39},
        {196, 39},
        {197, 39},
        {198, 39},
        {199, 39},
        {200, 39},
        {201, 39},
        {202, 39},
        {203, 39},
        {204, 39},
        {205, 39},
        {206, 39},
        {207, 39},
        {208, 39},
        {209, 39},
        {210, 39},
        {211, 39},
        {212, 39},
        {213, 39},
        {214, 39},
        {215, 39},
        {216, 39},
        {217, 39},
        {218, 39},
        {219, 39},
        {220, 39},
        {221, 39},
        {222, 39},
        {223, 39},
        {224, 39},
        {225, 39},
        {226, 39},
        {227, 39},
        {228, 39},
        {229, 39},
        {230, 39},
        {231, 39},
        {232, 39},
        {233, 39},
        {234, 39},
        {235, 39},
        {236, 39},
        {237, 39},
        {238, 39},
        {239, 39},
        {240, 39},
        {241, 39},
        {242, 39},
        {243, 39},
        {244, 39},
        {245, 39},
        {246, 39},
        {247, 39},
        {248, 39},
        {249, 39},
        {250, 39},
        {251, 39},
        {252, 39},
        {253, 39},
        {254, 39},
        {255, 39},
        {9, 28},
        {13, 28},
        {32, 28},
        {33, 28},
        {34, 28},
        {35, 28},
        {36, 28},
        {37, 28},
        {38, 28},
        {39, 28},
        {40, 28},
        {41, 28},
        {42, 28},
        {43, 28},
        {44, 28},
        {45, 28},
        {46, 28},
        {47, 28},
        {48, 28},
        {49, 28},
        {50, 28},
        {51, 28},
        {52, 28},
        {53, 28},
        {54, 28},
        {55, 28},
        {56, 28},
        {57, 28},
        {58, 28},
        {59, 28},
        {60, 28},
        {61, 28},
        {62, 28},
        {63, 28},
        {64, 28},
        {65, 28},
        {66, 28},
        {67, 28},
        {68, 28},
        {69, 28},
        {70, 28},
        {71, 28},
        {72, 28},
        {73, 28},
        {74, 28},
        {75, 28},
        {76, 28},
        {77, 28},
        {78, 28},
        {79, 28},
        {80, 28},
        {81, 28},
        {82, 28},
        {83, 28},
        {84, 28},
        {85, 28},
        {86, 28},
        {87, 28},
        {88, 28},
        {89, 28},
        {90, 28},
        {91, 28},
        {92, 28},
        {93, 28},
        {94, 28},
        {95, 28},
        {96, 28},
        {97, 28},
        {98, 28},
        {99, 28},
        {100, 28},
        {101, 28},
        {102, 28},
        {103, 28},
        {104, 28},
        {105, 28},
        {106, 28},
        {107, 28},
        {108, 28},
        {109, 28},
        {110, 28},
        {111, 28},
        {112, 28},
        {113, 28},
        {114, 28},
        {115, 28},
        {116, 28},
        {117, 28},
        {118, 28},
        {119, 28},
        {120, 28},
        {121, 28},
        {122, 28},
        {123, 28},
        {124, 28},
        {125, 28},
        {126, 28},
        {161, 28},
        {162, 28},
        {163, 28},
        {164, 28},
        {165, 28},
        {166, 28},
        {167, 28},
        {168, 28},
        {169, 28},
        {170, 28},
        {171, 28},
        {172, 28},
        {173, 28},
        {174, 28},
        {175, 28},
        {176, 28},
        {177, 28},
        {178, 28},
        {179, 28},
        {180, 28},
        {181, 28},
        {182, 28},
        {183, 28},
        {184, 28},
        {185, 28},
        {186, 28},
        {187, 28},
        {188, 28},
        {189, 28},
        {190, 28},
        {191, 28},
        {192, 28},
        {193, 28},
        {194, 28},
        {195, 28},
        {196, 28},
        {197, 28},
        {198, 28},
        {199, 28},
        {200, 28},
        {201, 28},
        {202, 28},
        {203, 28},
        {204, 28},
        {205, 28},
        {206, 28},
        {207, 28},
        {208, 28},
        {209, 28},
        {210, 28},
        {211, 28},
        {212, 28},
        {213, 28},
        {214, 28},
        {215, 28},
        {216, 28},
        {217, 28},
        {218, 28},
        {219, 28},
        {220, 28},
        {221, 28},
        {222, 28},
        {223, 28},
        {224, 28},
        {225, 28},
        {226, 28},
        {227, 28},
        {228, 28},
        {229, 28},
        {230, 28},
        {231, 28},
        {232, 28},
        {233, 28},
        {234, 28},
        {235, 28},
        {236, 28},
        {237, 28},
        {238, 28},
        {239, 28},
        {240, 28},
        {241, 28},
        {242, 28},
        {243, 28},
        {244, 28},
        {245, 28},
        {246, 28},
        {247, 28},
        {248, 28},
        {249, 28},
        {250, 28},
        {251, 28},
        {252, 28},
        {253, 28},
        {254, 28},
        {255, 28},
        {48, 40},
        {49, 40},
        {50, 40},
        {51, 40},
        {52, 40},
        {53, 40},
        {54, 40},
        {55, 40},
        {56, 40},
        {57, 40},
        {46, 31},
        {48, 32},
        {49, 32},
        {50, 32},
        {51, 32},
        {52, 32},
        {53, 32},
        {54, 32},
        {55, 32},
        {56, 32},
        {57, 32},
        {48, 36},
        {49, 36},
        {50, 36},
        {51, 36},
        {52, 36},
        {53, 36},
        {54, 36},
        {55, 36},
        {56, 36},
        {57, 36},
        {65, 21},
        {66, 21},
        {67, 21},
        {68, 21},
        {69, 21},
        {70, 21},
        {71, 21},
        {72, 21},
        {73, 21},
        {74, 21},
        {75, 21},
        {76, 21},
        {77, 21},
        {78, 21},
        {79, 21},
        {80, 21},
        {81, 21},
        {82, 21},
        {83, 21},
        {84, 21},
        {85, 21},
        {86, 21},
        {87, 21},
        {88, 21},
        {89, 21},
        {90, 21},
        {95, 36},
        {97, 36},
        {98, 36},
        {99, 36},
        {100, 36},
        {101, 36},
        {102, 36},
        {103, 36},
        {104, 36},
        {105, 36},
        {106, 36},
        {107, 36},
        {108, 36},
        {109, 36},
        {110, 36},
        {111, 36},
        {112, 36},
        {113, 36},
        {114, 36},
        {115, 36},
        {116, 36},
        {117, 36},
        {118, 36},
        {119, 36},
        {120, 36},
        {121, 36},
        {122, 36},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {95, 24},
        {97, 24},
        {98, 24},
        {99, 24},
        {100, 24},
        {101, 24},
        {102, 24},
        {103, 24},
        {104, 24},
        {105, 24},
        {106, 24},
        {107, 24},
        {108, 24},
        {109, 24},
        {110, 24},
        {111, 24},
        {112, 24},
        {113, 24},
        {114, 24},
        {115, 24},
        {116, 24},
        {117, 24},
        {118, 24},
        {119, 24},
        {120, 24},
        {121, 24},
        {122, 24},
        {9, 39},
        {10, 39},
        {13, 39},
        {32, 39},
        {33, 39},
        {34, 39},
        {35, 41},
        {36, 39},
        {37, 39},
        {38, 39},
        {39, 39},
        {40, 39},
        {41, 39},
        {42, 39},
        {43, 39},
        {44, 39},
        {45, 39},
        {46, 39},
        {47, 39},
        {48, 39},
        {49, 39},
        {50, 39},
        {51, 39},
        {52, 39},
        {53, 39},
        {54, 39},
        {55, 39},
        {56, 39},
        {57, 39},
        {58, 39},
        {59, 39},
        {60, 39},
        {61, 39},
        {62, 39},
        {63, 39},
        {64, 39},
        {65, 39},
        {66, 39},
        {67, 39},
        {68, 39},
        {69, 39},
        {70, 39},
        {71, 39},
        {72, 39},
        {73, 39},
        {74, 39},
        {75, 39},
        {76, 39},
        {77, 39},
        {78, 39},
        {79, 39},
        {80, 39},
        {81, 39},
        {82, 39},
        {83, 39},
        {84, 39},
        {85, 39},
        {86, 39},
        {87, 39},
        {88, 39},
        {89, 39},
        {90, 39},
        {91, 39},
        {92, 39},
        {93, 39},
        {94, 39},
        {95, 39},
        {96, 39},
        {97, 39},
        {98, 39},
        {99, 39},
        {100, 39},
        {101, 39},
        {102, 39},
        {103, 39},
        {104, 39},
        {105, 39},
        {106, 39},
        {107, 39},
        {108, 39},
        {109, 39},
        {110, 39},
        {111, 39},
        {112, 39},
        {113, 39},
        {114, 39},
        {115, 39},
        {116, 39},
        {117, 39},
        {118, 39},
        {119, 39},
        {120, 39},
        {121, 39},
        {122, 39},
        {123, 39},
        {124, 42},
        {125, 39},
        {126, 39},
        {161, 39},
        {162, 39},
        {163, 39},
        {164, 39},
        {165, 39},
        {166, 39},
        {167, 39},
        {168, 39},
        {169, 39},
        {170, 39},
        {171, 39},
        {172, 39},
        {173, 39},
        {174, 39},
        {175, 39},
        {176, 39},
        {177, 39},
        {178, 39},
        {179, 39},
        {180, 39},
        {181, 39},
        {182, 39},
        {183, 39},
        {184, 39},
        {185, 39},
        {186, 39},
        {187, 39},
        {188, 39},
        {189, 39},
        {190, 39},
        {191, 39},
        {192, 39},
        {193, 39},
        {194, 39},
        {195, 39},
        {196, 39},
        {197, 39},
        {198, 39},
        {199, 39},
        {200, 39},
        {201, 39},
        {202, 39},
        {203, 39},
        {204, 39},
        {205, 39},
        {206, 39},
        {207, 39},
        {208, 39},
        {209, 39},
        {210, 39},
        {211, 39},
        {212, 39},
        {213, 39},
        {214, 39},
        {215, 39},
        {216, 39},
        {217, 39},
        {218, 39},
        {219, 39},
        {220, 39},
        {221, 39},
        {222, 39},
        {223, 39},
        {224, 39},
        {225, 39},
        {226, 39},
        {227, 39},
        {228, 39},
        {229, 39},
        {230, 39},
        {231, 39},
        {232, 39},
        {233, 39},
        {234, 39},
        {235, 39},
        {236, 39},
        {237, 39},
        {238, 39},
        {239, 39},
        {240, 39},
        {241, 39},
        {242, 39},
        {243, 39},
        {244, 39},
        {245, 39},
        {246, 39},
        {247, 39},
        {248, 39},
        {249, 39},
        {250, 39},
        {251, 39},
        {252, 39},
        {253, 39},
        {254, 39},
        {255, 39},
        {48, 43},
        {49, 40},
        {50, 40},
        {51, 40},
        {52, 40},
        {53, 40},
        {54, 40},
        {55, 40},
        {56, 40},
        {57, 40},
        {9, 39},
        {10, 39},
        {13, 39},
        {32, 39},
        {33, 39},
        {34, 39},
        {35, 41},
        {36, 39},
        {37, 39},
        {38, 39},
        {39, 39},
        {40, 39},
        {41, 39},
        {42, 39},
        {43, 39},
        {44, 39},
        {45, 39},
        {46, 39},
        {47, 39},
        {48, 39},
        {49, 39},
        {50, 39},
        {51, 39},
        {52, 39},
        {53, 39},
        {54, 39},
        {55, 39},
        {56, 39},
        {57, 39},
        {58, 39},
        {59, 39},
        {60, 39},
        {61, 39},
        {62, 39},
        {63, 39},
        {64, 39},
        {65, 39},
        {66, 39},
        {67, 39},
        {68, 39},
        {69, 39},
        {70, 39},
        {71, 39},
        {72, 39},
        {73, 39},
        {74, 39},
        {75, 39},
        {76, 39},
        {77, 39},
        {78, 39},
        {79, 39},
        {80, 39},
        {81, 39},
        {82, 39},
        {83, 39},
        {84, 39},
        {85, 39},
        {86, 39},
        {87, 39},
        {88, 39},
        {89, 39},
        {90, 39},
        {91, 39},
        {92, 39},
        {93, 39},
        {94, 39},
        {95, 39},
        {96, 39},
        {97, 39},
        {98, 39},
        {99, 39},
        {100, 39},
        {101, 39},
        {102, 39},
        {103, 39},
        {104, 39},
        {105, 39},
        {106, 39},
        {107, 39},
        {108, 39},
        {109, 39},
        {110, 39},
        {111, 39},
        {112, 39},
        {113, 39},
        {114, 39},
        {115, 39},
        {116, 39},
        {117, 39},
        {118, 39},
        {119, 39},
        {120, 39},
        {121, 39},
        {122, 39},
        {123, 39},
        {125, 39},
        {126, 39},
        {161, 39},
        {162, 39},
        {163, 39},
        {164, 39},
        {165, 39},
        {166, 39},
        {167, 39},
        {168, 39},
        {169, 39},
        {170, 39},
        {171, 39},
        {172, 39},
        {173, 39},
        {174, 39},
        {175, 39},
        {176, 39},
        {177, 39},
        {178, 39},
        {179, 39},
        {180, 39},
        {181, 39},
        {182, 39},
        {183, 39},
        {184, 39},
        {185, 39},
        {186, 39},
        {187, 39},
        {188, 39},
        {189, 39},
        {190, 39},
        {191, 39},
        {192, 39},
        {193, 39},
        {194, 39},
        {195, 39},
        {196, 39},
        {197, 39},
        {198, 39},
        {199, 39},
        {200, 39},
        {201, 39},
        {202, 39},
        {203, 39},
        {204, 39},
        {205, 39},
        {206, 39},
        {207, 39},
        {208, 39},
        {209, 39},
        {210, 39},
        {211, 39},
        {212, 39},
        {213, 39},
        {214, 39},
        {215, 39},
        {216, 39},
        {217, 39},
        {218, 39},
        {219, 39},
        {220, 39},
        {221, 39},
        {222, 39},
        {223, 39},
        {224, 39},
        {225, 39},
        {226, 39},
        {227, 39},
        {228, 39},
        {229, 39},
        {230, 39},
        {231, 39},
        {232, 39},
        {233, 39},
        {234, 39},
        {235, 39},
        {236, 39},
        {237, 39},
        {238, 39},
        {239, 39},
        {240, 39},
        {241, 39},
        {242, 39},
        {243, 39},
        {244, 39},
        {245, 39},
        {246, 39},
        {247, 39},
        {248, 39},
        {249, 39},
        {250, 39},
        {251, 39},
        {252, 39},
        {253, 39},
        {254, 39},
        {255, 39},
        {9, 39},
        {10, 39},
        {13, 39},
        {32, 39},
        {33, 39},
        {34, 39},
        {35, 44},
        {36, 39},
        {37, 39},
        {38, 39},
        {39, 39},
        {40, 39},
        {41, 39},
        {42, 39},
        {43, 39},
        {44, 39},
        {45, 39},
        {46, 39},
        {47, 39},
        {48, 39},
        {49, 39},
        {50, 39},
        {51, 39},
        {52, 39},
        {53, 39},
        {54, 39},
        {55, 39},
        {56, 39},
        {57, 39},
        {58, 39},
        {59, 39},
        {60, 39},
        {61, 39},
        {62, 39},
        {63, 39},
        {64, 39},
        {65, 39},
        {66, 39},
        {67, 39},
        {68, 39},
        {69, 39},
        {70, 39},
        {71, 39},
        {72, 39},
        {73, 39},
        {74, 39},
        {75, 39},
        {76, 39},
        {77, 39},
        {78, 39},
        {79, 39},
        {80, 39},
        {81, 39},
        {82, 39},
        {83, 39},
        {84, 39},
        {85, 39},
        {86, 39},
        {87, 39},
        {88, 39},
        {89, 39},
        {90, 39},
        {91, 39},
        {92, 39},
        {93, 39},
        {94, 39},
        {95, 39},
        {96, 39},
        {97, 39},
        {98, 39},
        {99, 39},
        {100, 39},
        {101, 39},
        {102, 39},
        {103, 39},
        {104, 39},
        {105, 39},
        {106, 39},
        {107, 39},
        {108, 39},
        {109, 39},
        {110, 39},
        {111, 39},
        {112, 39},
        {113, 39},
        {114, 39},
        {115, 39},
        {116, 39},
        {117, 39},
        {118, 39},
        {119, 39},
        {120, 39},
        {121, 39},
        {122, 39},
        {123, 39},
        {125, 39},
        {126, 39},
        {161, 39},
        {162, 39},
        {163, 39},
        {164, 39},
        {165, 39},
        {166, 39},
        {167, 39},
        {168, 39},
        {169, 39},
        {170, 39},
        {171, 39},
        {172, 39},
        {173, 39},
        {174, 39},
        {175, 39},
        {176, 39},
        {177, 39},
        {178, 39},
        {179, 39},
        {180, 39},
        {181, 39},
        {182, 39},
        {183, 39},
        {184, 39},
        {185, 39},
        {186, 39},
        {187, 39},
        {188, 39},
        {189, 39},
        {190, 39},
        {191, 39},
        {192, 39},
        {193, 39},
        {194, 39},
        {195, 39},
        {196, 39},
        {197, 39},
        {198, 39},
        {199, 39},
        {200, 39},
        {201, 39},
        {202, 39},
        {203, 39},
        {204, 39},
        {205, 39},
        {206, 39},
        {207, 39},
        {208, 39},
        {209, 39},
        {210, 39},
        {211, 39},
        {212, 39},
        {213, 39},
        {214, 39},
        {215, 39},
        {216, 39},
        {217, 39},
        {218, 39},
        {219, 39},
        {220, 39},
        {221, 39},
        {222, 39},
        {223, 39},
        {224, 39},
        {225, 39},
        {226, 39},
        {227, 39},
        {228, 39},
        {229, 39},
        {230, 39},
        {231, 39},
        {232, 39},
        {233, 39},
        {234, 39},
        {235, 39},
        {236, 39},
        {237, 39},
        {238, 39},
        {239, 39},
        {240, 39},
        {241, 39},
        {242, 39},
        {243, 39},
        {244, 39},
        {245, 39},
        {246, 39},
        {247, 39},
        {248, 39},
        {249, 39},
        {250, 39},
        {251, 39},
        {252, 39},
        {253, 39},
        {254, 39},
        {255, 39},
        {48, 43},
        {49, 40},
        {50, 40},
        {51, 40},
        {52, 40},
        {53, 40},
        {54, 40},
        {55, 40},
        {56, 40},
        {57, 40}
    };

    int[] TOKEN_STATE = {-2,  0, -1, -1, -2, -2, 29, 30, 39, 37, 41, 38, 42, 40,  3,  3, 44, 43, 33, 45, 35,  2, -1, 48,  2, 32,  5, -2,  0, 46, 47, -1,  3, 34, 31, 36,  2,  6,  2, -2,  4, -2, -2, -1,  0 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 };

    String[] SPECIAL_CASES_KEYS =
        {  "and", "begin", "bool", "char", "end", "false", "float", "forward", "ifFalseDo", "ifTrueDo", "int", "main", "module", "not", "or", "read", "string", "true", "void", "whileFalseDo", "whileTrueDo", "write" };

    int[] SPECIAL_CASES_VALUES =
        {  7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28 };

    String[] SCANNER_ERROR =
    {
        "S�mbolo inv�lido.",
        "",
        "S�mbolo inv�lido.",
        "Constante string inv�lida.",
        "Erro identificando <ignorar>",
        "Erro identificando <ignorar>",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Constante caracter inv�lida.",
        "",
        "",
        "",
        "",
        "Erro identificando <ignorar>",
        "",
        "",
        "",
        "Constante real inv�lida.",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando <ignorar>",
        "",
        "Erro identificando <ignorar>",
        "Erro identificando <ignorar>",
        "Constante real inv�lida.",
        ""
    };

}