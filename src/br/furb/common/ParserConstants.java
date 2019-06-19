package br.furb.common;

public interface ParserConstants
{
    int START_SYMBOL = 49;

    int FIRST_NON_TERMINAL    = 49;
    int FIRST_SEMANTIC_ACTION = 96;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 25, -1, -1, -1, -1, -1, -1, 25, 25, -1, -1, 25, -1, -1, -1, 25, -1, -1, -1, -1, 25, 25, -1, -1, -1, -1, 25, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25 },
        { -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1,  6,  7, -1, -1,  5, -1, -1, -1,  4, -1, -1, -1, -1, -1,  8, -1,  9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 57, 57, -1, -1, 57, -1, -1, -1, 57, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 10, 10, -1, -1, 10, -1, -1, -1, 10, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 13, 13, -1, -1, 13, -1, -1, -1, 13, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 18, 16, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, 21, 21, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 26, -1, -1, -1, -1, -1, -1, 27, 27, -1, -1, 27, -1, -1, -1, 27, -1, -1, -1, -1, 26, 27, -1, -1, -1, -1, 26, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26 },
        { -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, 32, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 28, 28, -1, -1, 28, -1, -1, -1, 28, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 31, 31, -1, -1, 31, -1, -1, -1, 31, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, 37, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39 },
        { -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55 },
        { -1, 58, 58, 58, 58, 58, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, -1, -1, 58, -1, -1, -1, 58, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, -1, -1, 58, 58, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, 44, 45, -1 },
        { -1, 48, 48, 48, 48, 48, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, 48, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, 66, -1, -1, -1, 64, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, 71, 72, 73, 74, 75, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 76, 76, 76, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 76, -1, -1, -1, -1, -1, -1, -1, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, 77, 77, 77, 77, 77, 77, 77, 78, 78, -1, -1, 77, 77, -1, -1, -1, -1, -1, -1 },
        { -1, 81, 81, 81, 81, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 81, -1, -1, -1, -1, -1, -1, -1, 81, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 82, -1, -1, -1, -1, -1, -1, -1, -1, 82, 82, 82, 82, 82, 82, 82, 82, 82, 83, 83, 82, 82, -1, -1, -1, -1, -1, -1 },
        { -1, 86, 87, 88, 90, 89, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 91, -1, -1, -1, -1, -1, -1, -1, 92, 93, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1 },
        { -1, 29, -1, -1, -1, -1, -1, -1, 30, 30, -1, -1, 30, -1, -1, -1, 30, -1, -1, -1, -1, 29, 30, -1, -1, -1, -1, 29, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29 },
        { -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, 34, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, -1, -1, -1, -1, -1, -1, -1, -1, 69, 68, 68, 68, 68, 68, 68, -1, -1, -1, -1, 69, 69, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 84, 85, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 94, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 94, -1, -1, -1, -1, -1, -1, -1, 95, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, -1, -1, -1, -1, -1, -1 },
        { -1, 97, 97, 97, 97, 97, -1, -1, -1, -1, -1, 97, -1, -1, -1, -1, -1, -1, -1, 97, -1, -1, -1, 97, -1, -1, -1, -1, 97, 96, -1, -1, -1, -1, -1, -1, 97, 97, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 111,  18,  50,  52, 112,   8,  51,  11, 113 },
        {   0 },
        {  53,  50 },
        {  14,  19,  54,   2,  29,  55,  30 },
        {  17 },
        {  13 },
        {   9 },
        {  10 },
        {  23 },
        {  25 },
        {  57,  84 },
        {   0 },
        {  43,  56 },
        {  58,  44,  59 },
        {  17 },
        {  13 },
        {  10 },
        {  23 },
        {   9 },
        {   2, 128,  60 },
        {  41,  59 },
        {   0 },
        {   0 },
        {  61,  52 },
        {  19,   2,   8,  51,  11 },
        {  62,  63 },
        {   0 },
        {  64 },
        {  65,  42,  85 },
        {   0 },
        {  64 },
        {  58, 126,  44,  59, 127 },
        {  66,  42,  86 },
        {   0 },
        {  63 },
        {  67 },
        {  68 },
        {  69 },
        { 133,  29,  71,  30,  95 },
        {  70 },
        {  16, 134,  63,  75,  11, 135 },
        {  88 },
        {   2, 128,  73, 132,  71, 130 },
        {  45 },
        {  46 },
        {  47 },
        {  22,  29,  59, 131,  30 },
        {  28,  29,  74,  30 },
        {  71, 110,  87 },
        {   0 },
        {  41,  74 },
        {   0 },
        { 136,  15,  63 },
        {  27, 137,  63,  11, 138 },
        {  26, 137,  63,  11, 138 },
        {  48,  71 },
        {   0 },
        {  56 },
        {  76,  72 },
        {   0 },
        {  89,  72 },
        {   7,  76, 114 },
        {  21,  76, 115 },
        {  77 },
        {  24, 107 },
        {  12, 108 },
        {  20,  76, 109 },
        {  79,  90 },
        {  78, 105,  79, 106 },
        {   0 },
        {  31 },
        {  32 },
        {  33 },
        {  34 },
        {  35 },
        {  36 },
        {  81,  80 },
        {   0 },
        {  91,  80 },
        {  37,  81,  97 },
        {  38,  81,  98 },
        {  83,  82 },
        {   0 },
        {  92,  82 },
        {  39,  83,  99 },
        {  40,  83, 100 },
        {   2, 129,  93 },
        {   3, 101 },
        {   4, 102 },
        {   6, 116 },
        {   5, 117 },
        {  29,  71,  30 },
        {  37,  83, 103 },
        {  38,  83, 104 },
        {   0 },
        {  29,  94 },
        {  30 },
        {  74,  30 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "esperado fim de arquivo",
        "esperado id",
        "esperado constante int",
        "esperado constante float",
        "esperado constante stirng",
        "esperado constante caracter",
        "esperado and",
        "esperado begin",
        "esperado bool",
        "esperado char",
        "esperado end",
        "esperado false",
        "esperado float",
        "esperado forward",
        "esperado ifFalseDo",
        "esperado ifTrueDo",
        "esperado int",
        "esperado main",
        "esperado module",
        "esperado not",
        "esperado or",
        "esperado read",
        "esperado string",
        "esperado true",
        "esperado void",
        "esperado whileFalseDo",
        "esperado whileTrueDo",
        "esperado write",
        "esperado \"(\"",
        "esperado \")\"",
        "esperado \"==\"",
        "esperado \"!=\"",
        "esperado \"<\"",
        "esperado \"<=\"",
        "esperado \">\"",
        "esperado \">=\"",
        "esperado \"+\"",
        "esperado \"-\"",
        "esperado \"*\"",
        "esperado \"/\"",
        "esperado \",\"",
        "esperado \".\"",
        "esperado \";\"",
        "esperado \":\"",
        "esperado \"=\"",
        "esperado \"+=\"",
        "esperado \"-=\"",
        "esperado \"^\"",
        "esperado main", //"<programa> inv�lido",
        "esperado begin forward module", //"<lista_declaracao> inv�lido",
        "esperado id tipo read write ( ^", //"<corpo> inv�lido",
        "esperado begin module", //"<lista_modulo> inv�lido",
        "esperado forward", //"<declaracao> inv�lido",
        "esperado tipo", //"<tipo_modulo> inv�lido",
        "esperado tipo )", //"<parametros_formais> inv�lido",
        "esperado tipo ", //"<parametros> inv�lido",
        "esperado tipo", //"<parametro> inv�lido",
        "esperado tipo", //"<tipo> inv�lido",
        "esperado id", //"<lista_de_indentificadores> inv�lido",
        "esperado ) , . ;", //"<lista_de_indentificadores1> inv�lido",
        "esperado module", //"<modulo> inv�lido",
        "esperado id tipo read write ( ^", //"<declaracao_de_variaveis> inv�lido",
        "esperado id read write ( ^", //"<lista_de_comandos> inv�lido",
        "esperado tipo", //"<lista_variaveis> inv�lido",
        "esperado tipo", //"<variaveis> inv�lido",
        "esperado id read write ( ^", //"<comando> inv�lido",
        "esperado id", //"<comando_atribuicao> inv�lido",
        "esperado read", //"<comando_entrada> inv�lido",
        "esperado write", //"<comando_saida> inv�lido",
        "esperado ^", //"<comando_retorno> inv�lido",
        "esperada express�o", //"<expressao> inv�lido",
        "esperada express�o", //"<exp> inv�lido",
        "esperado = += -=", //"<operador_de_atribuicao> inv�lido",
        "esperada express�o", //"<lista_de_expressoes> inv�lido",
        "esperado end ifFalseDo", //"<comando_selecao_false> inv�lido",
        "esperada express�o", //"<elemento> inv�lido",
        "esperada express�o", //"<relacional> inv�lido",
        "esperada express�o", //"<operador_relacional> inv�lido",
        "esperada express�o", //"<aritm�tica> inv�lido",
        "esperada express�o", //"<arit> inv�lido",
        "esperada express�o", //"<termo> inv�lido",
        "esperada express�o", //"<ter> inv�lido",
        "esperada express�o", //"<fator> inv�lido",
        "esperado ) ;", //"<p1> inv�lido",
        "esperado id tipo read write ( ^", //"<v1> inv�lido",
        "esperado id end ifFalseDo read write ( ^", //"<c1> inv�lido",
        "esperada express�o", //"<e1> inv�lido",
        "esperado whileFalseDo whileTrueDo", //"<e2> inv�lido",
        "esperada express�o", //"<e3> inv�lido",
        "esperada express�o", //"<a1> inv�lido",
        "esperada express�o", //"<a2> inv�lido",
        "esperada express�o", //"<t1> inv�lido",
        "esperada express�o", //"<i1> inv�lido",
        "esperada express�o", //"<i2> inv�lido",
        "esperado ifTrueDo whileFalseDo whileTrueDo", //"<comando1> inv�lido"
    };
}

