#include <stdio.h>
#include <stdlib.h>

int main(void)
{
  int yen, i;
  printf("1円〜9999円で金額を入力してください->\n");
  scanf("%d", &yen);
  if (yen >= 10000 || yen < 1)
  {
    printf("計算不可能な金額です。処理を終了します。\n");
    exit(0);
  }
  int unitarray[] = {5000, 1000, 500, 100, 50, 10, 5, 1}; //配列に円の単位を格納

  for (i = 0; unitarray[i] >= 1; i++)
  {
    if (yen / unitarray[i] != 0)
    {
      printf("%d円:%d枚\n", unitarray[i], yen / unitarray[i]);
    }
    yen %= unitarray[i];
  }
  return 0;
}

/*
説明

選択課題: B-1

    main()関数で、1以上、9999以下の整数を入力してもらい、それを変数yenに格納する。
    指定値以外の値が入力された場合、メッセージを表示し処理を終了する。

    指定値が入力された場合、で円の単位を配列に格納する。(14行目)
    for文で下記ループ処理を行う。
    ①入力値yenを配列のi番目の単位の整数で除算を行い、結果が0でない場合(除算できた場合)
    その金額を表示する。
    ②入力値yenに、yenを配列のi番目の単位で割った剰余を代入する。
    ③判定結果がNullポインタとなるまで
    (配列に格納された円の単位の個数分)ループ処理を行う。判定結果がNullポインタであった場合、ループ処理を終了する
    */