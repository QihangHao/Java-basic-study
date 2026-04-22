package com.review;

/**
 * @author 郝启航
 */
public class MountEverestFolding {
    static void main() {
        double paper =0.1;
        double mountain =8844430.0;
        int count =0;
        while(paper<=mountain){
            paper*=2;
            count++;
        }
        System.out.println("折叠了 "+count+" 次后，厚度超过了珠穆朗玛峰，最终厚度为 "+paper+" 毫米");
    }
}
