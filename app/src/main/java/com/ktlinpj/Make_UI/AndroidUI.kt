package com.ktlinpj.Make_UI

// 안드로이드에서 화면을 그리는 방법
// - XML을 사용한다,
// - XML = DSL Language ==> Domain Specific Language
// => 도메인: 범주 // 어떠한 범주에 특화되어있는 언어
// - 안드로이드 UI를 그리기 위해 특화된 언어

// 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야 할까?
// - 픽셀, dpi, dp 단위
// - 픽셀 => 핸드폰 화면에서 빛이 나오는 전구 -> 가장 작은 단위
// - dpi => dot per inch
//      --> ldpi - 120(1인치에 120픽셀)
//      --> mdpi - 160(1인치에 160픽셀)
//      --> hdpi - 240(1인치에 240픽셀)
//      --> xhdpi - 320(1인치에 320픽셀)
//      --> xxhdpi - 480(1인치에 480픽셀)
//      --> xxxhdpi - 640(1인치에 640픽셀)

// 어느 기종에서나 원하는 UI가 나오게끔 통일시켜야하는데 이때 사용되는 단위가 "dp"이다.
// - dp -> Density Independent Pixel
//      - 픽셀 독립적인 단위
