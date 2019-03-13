package by.stormnet.task.conditionals;

import by.stormnet.task.TaskNotImplementedException;

class IfElseTask {

  /**
   * Используя блок if/else, напишите код, который вернет
   * значение 42, если результат умножения x на y больше 10.
   * Если результат умножения x на у меньше или равен 10,
   * то следует вернуть разность между x и y.
   */
  int ifElse(int x, int y) {
    if (x*y>10)
    {return 42;}
  else
    {return x-y;}
  }

  /**
   * Используя блок if/else if, напишите код, который вернет целую часть
   * от результата деления x на y умноженную:
   *   - на 2, если x меньше 10;
   *   - на 3, если x больше либо равно 10 и x меньше 15;
   *   - на 4, если x больше либо равно 15 и y больше 15.
   */
  int ifElseIf(float x, float y) {
    if (x<10)
    {return (int)(x/y)*2;}
    else if (x>=10&&x<15)
    {return (int)(x/y)*3;}
    else if (x>=15&&y>15)
    {return (int)(x/y)*4;}
    return 0;
  }

  /**
   * Используя блок if/else if/else, напишите код, который вернет
   * x умноженный:
   *   - на 2, если x четное число;
   *   - на 3, если x без остатка делится на 3.
   * Если не выполняется ни одно из условий, то нужно вернуть исходное значение x.
   */
  int ifElseIfElse(int x) {
    if(x%2==0)
    {return x*2;}
    if(x%3==0)
    {return x*3;}
    else
    {return x;}
  }
}
