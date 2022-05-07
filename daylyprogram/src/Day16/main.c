/*3以上の整数を入力すると、
より小さい最大の素数と、より大きい最小の素数を表示するプログラム*/

//※1は素数ではない。素数とは、1とその数自身の他に約数を持たない数のこと

// 3以上の整数Nが素数であるかは、次のように判定可能
//２で割り切れれば、Nは素数ではない
//３で割り切れれば、Nは素数ではない
// N-1で割り切れれば、Nは素数ではない
// 2~N-1のいずれでも割り切れなければ、Nは素数である

#include <stdio.h>

int main(void)
{
  int n, i;

  printf("3以上の整数を入力しなさい！");
  scanf("%d", &n);

  for (i = n - 1; i > 1; i--)
  {
    if (is_prime(i))
    {
      printf("%dより小さい最大の素数: %d\n", n, i);
      break;
    }
  }

  for (i = n + 1;; i++)
  {
    if (is_prime(i))
    {
      printf("%dより大きい最大の素数: %d\n", n, i);
      break;
    }
  }
  return 0;
}

// int型の引数が素数であれば1を、素数でなければ0を返す関数
int is_prime(int a)
{
  int f = 1;
  int i;

  for (i = 2; i < a; i++)
  {
    //素数でない
    if (a % i == 0)
    {
      f = 0;
      break;
    }
  }
  //素数
  return f;
}