package com.daily.study;



/**
 * @author 郝启航
 */
class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public boolean compareArea(Rectangle r, Rectangle m) {
        if (r.getArea() > m.getArea()) {
            return true;
        } else {
            return false;
        }
    }
}

public class CompareRectangles {

    static void main() {
       Rectangle r = new Rectangle(50, 5);
       Rectangle m = new Rectangle(5, 8);
       if(r.compareArea(r, m)){
           System.out.println("第一个长方形面积较大");
       }else{
           System.out.println("第二个长方形面积较大");
       }
       }


    }

 /*public static double compareRectangles(double a, double b, double c, double d) {
        return Math.max(a * b, c * d);
    }
*/
/* double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double d = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个长方形的长和宽：");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("请输入第二个长方形的长和宽：");
        c = sc.nextDouble();
        d = sc.nextDouble();
        System.out.println("两个长方形的较大面积是：" + compareRectangles(a, b, c, d));
这是个基础解法然后用一下类去让代码变的整洁一点*/