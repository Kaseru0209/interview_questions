package Object;
//计算器的类
class Calculator {
    private int num1;
    private int num2;
 
    public int getNum1() {
        return num1;
    }
 
    public void setNum1(int num1) {
        this.num1 = num1;
    }
 
    public int getNum2() {
        return num2;
    }
 
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    //加法
    public int add() {
        return num1 + num2;
    }
    //减法
    public int sub() {
        return num1 - num2;
    }
    //乘法
    public int mul() {
        return num1 * num2;
    }
    //除法
    public double dev() {
        return num1*1.0/num2;
    }
 
}
 
public class oriented {
    public static void main(String[] args) {
        //类实现面向对象
        Calculator calculator = new Calculator();
        //给num1 和 num2 赋值
        calculator.setNum1(2);
        calculator.setNum2(4);
 
        System.out.println("加："+calculator.add());
        System.out.println("减："+calculator.sub());
        System.out.println("乘："+calculator.mul());
        System.out.println("除："+calculator.dev());
 
 
    }
}
