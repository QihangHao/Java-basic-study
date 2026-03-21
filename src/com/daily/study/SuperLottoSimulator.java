package com.daily.study;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Random;

/**
 * @author 郝启航
 */
class Lotto {
    TreeSet<Integer> front ;
    TreeSet<Integer> back ;

    public Lotto(TreeSet<Integer> front, TreeSet<Integer> back){
        this.front = front;
        this.back = back;
    }

    public static Lotto winNumber() {
        Random random = new Random();
        TreeSet<Integer> front = new TreeSet<>();
        TreeSet<Integer> back = new TreeSet<>();
        while(front.size()<5){
            int num = random.nextInt(35)+1;
            front.add(num);
        }
        while(back.size()<2){
            int num = random.nextInt(12)+1;
            back.add(num);
        }
        return new Lotto(front,back);
    }
    public static Lotto userNumber() {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> front = new TreeSet<>();
        TreeSet<Integer> back = new TreeSet<>();
        int num;
        while(front.size()<5){
            System.out.println("请输入第" + (front.size()+1) + "个数字：");
            num = scanner.nextInt();
           if(num<=0 || num > 35){
               System.out.println("请勿输入小于0大于35的数字！");
           }
           else{
               if(!(front.add(num))){
                   System.out.println("请勿输入重复数字！");
               }
           }
        }
        while(back.size()<2){
            System.out.println("请输入第" + (back.size()+6) + "个数字：");
            num = scanner.nextInt();
            if(num<=0 || num > 12){
                System.out.println("请勿输入小于0大于12的数字！");
            }
            else{
                if(!(back.add(num))){
                    System.out.println("请勿输入重复数字！");
                }
            }
        }

        return new Lotto(front,back);
    }
    public static void checkPrize(Lotto win, Lotto user){
        int frontCount = 0;
        int backCount = 0;
       for(Integer i:user.front){
           if(win.front.contains(i)){
               frontCount++;
           }
       }
       for(Integer i:user.back){
           if(win.back.contains(i)){
               backCount++;
           }
       }
        // 假设你已经算出了 frontCount 和 backCount

        if (frontCount == 5 && backCount == 2) {
            System.out.println("🎉 卧槽！一等奖！1000万！明天老板去上班，你直接把公司买下来！");

        } else if (frontCount == 5 && backCount == 1) {
            System.out.println("✨ 牛啊！二等奖！500万！");

        } else if ((frontCount == 5 && backCount == 0) || (frontCount == 4 && backCount == 2)) {
            // 看这里！用括号括起来一组，中间用 || (或者) 连接。极其清晰！
            System.out.println("💰 不错不错！三等奖！可以提一辆车了！");

        } else if ((frontCount == 4 && backCount == 1) || (frontCount == 3 && backCount == 2)) {
            System.out.println("💸 四等奖！几个月工资到手！");

        }
// ... 下面的五等奖、六等奖，你照葫芦画瓢继续 else if 往下写
        else if ((frontCount == 4 && backCount == 0)||(frontCount == 3 && backCount == 1)||(frontCount == 2 && backCount == 2)) {
            System.out.println("💰 五等奖！可以提一个手机了！");
        }
        else if ((frontCount == 3 && backCount == 0)||(frontCount == 2 && backCount == 1)||(frontCount == 1 && backCount == 2)||(frontCount == 0 && backCount == 2)) {
            System.out.println("💰 六等奖！可以提一个电脑了！");
        }
        else {
            // 终极兜底方案：所有的奖项都没命中
            System.out.println("😭 完美避开所有正确答案，感谢您为国家福利事业作出的贡献！");
        }
    }
}

public class SuperLottoSimulator {
    static void main() {
        Lotto win = Lotto.winNumber();
        Lotto user = Lotto.userNumber();
        Lotto.checkPrize(win,user);
        System.out.println("中奖号码是：" + win.front + " " + win.back);
        System.out.println("用户号码是：" + user.front + " " + user.back);


    }
}
