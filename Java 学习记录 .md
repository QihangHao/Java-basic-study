# Java 学习记录 - 按时间顺序

## 📅 第一天：2026 年 3 月 15 日（周日）

### 学习时间：23:20:53（深夜学习）

**📁 文件：`LeetCode001.java` - 两数之和**

#### 🔍 练习内容
- 使用 HashMap 解决算法问题
- 通过补数思想（target - currentnum）快速查找
- 一边遍历一边查找的优化技巧

#### 📚 学习知识点
1. **HashMap 的应用**
   - `map.put(currentnum, i)` - 存储数值和索引
   - `map.containsKey(key)` - O(1) 时间复杂度查找
   - `map.get(key)` - 获取对应的索引值

2. **算法思维**
   - 空间换时间的思想
   - 一次遍历解决问题（时间复杂度 O(n)）
   - 相比暴力解法 O(n²) 的巨大提升

3. **交互输入**
   - Scanner 的使用
   - `hasNextInt()` 判断输入

#### 💡 新收获
第一次接触 HashMap 解决实际算法问题，理解了数据结构对算法效率的重要性

---

## 📅 第二天：2026 年 3 月 16 日（周一）

### 学习时间：19:38:38

**📁 文件：`LeetCode088.java` - 合并两个有序数组**

#### 🔍 练习内容
- 尝试了暴力解法（合并后冒泡排序）
- 学习最优解法（三指针从后向前）
- 记录了完整的思考过程

#### 📚 学习知识点
1. **暴力解法**
   ```java
   // 先合并到 num1 后面
   for (int i = 0; i < n; i++) {
       num1[m + i] = num2[i];
   }
   // 再冒泡排序 O((m+n)²)
   for (int i = 0; i < num1.length; i++) {
       for (int j = i + 1; j < num1.length; j++) {
           if (num1[i] > num1[j]) { 交换 }
       }
   }
   ```

2. **优化解法 - 三指针技巧**
   ```java
   int p = m - 1;      // num1 有效元素末尾
   int p1 = n - 1;     // num2 末尾  
   int pMax = m + n - 1;  // num1 总长度末尾
   while (p1 >= 0) {
       if (p < 0 || num1[p] < num2[p1]) {
           num1[pMax--] = num2[p1--];
       } else {
           num1[pMax--] = num1[p--];
       }
   }
   ```

3. **关键理解**
   - 从后向前遍历避免覆盖未处理元素
   - 利用 num1 有足够空间的条件
   - 时间复杂度从 O((m+n)²) 优化到 O(m+n)

#### 💡 新收获
学会了对比不同解法，理解了三指针技巧，知道了如何充分利用题目条件

---

### 学习时间：21:08:38

**📁 文件：`LeetCode035.java` - 搜索插入位置**

#### 🔍 练习内容
- 最初用 HashMap 思路（审题不清）
- 改用二分查找正确解法
- 处理查找失败的情况

#### 📚 学习知识点
1. **二分查找模板**
   ```java
   int left = 0;
   int right = num1.length - 1;
   while (left <= right) {
       int mid = (left + right) / 2;
       if (num1[mid] == target) {
           return mid;
       } else if (num1[mid] < target) {
           left = mid + 1;   // 右半部分
       } else {
           right = mid - 1;  // 左半部分
       }
   }
   return left;  // 未找到时的插入位置
   ```

2. **关键理解**
   - 二分查找前提：有序数组
   - 循环条件 `left <= right`
   - 边界收缩逻辑
   - 时间复杂度 O(log n)

#### 💡 新收获
掌握了二分查找的标准写法，学会了处理查找失败的情况

---

## 📅 第三天：2026 年 3 月 17 日（周二）- 高强度训练日

### 学习时间：11:08:11

**📁 文件：`Sum.java` - 两数相加**

#### 🔍 练习内容
- 静态方法的定义与调用
- Scanner 输入两个数
- 调用方法计算并输出结果

#### 📚 学习知识点
1. **静态方法**
   ```java
   static int getSum(int a, int b) {
       return a + b;
   }
   ```

2. **参数传递**
   - 值传递机制
   - 形参与实参的概念

3. **输入输出**
   ```java
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   System.out.println(getSum(a,b));
   ```

#### 💡 新收获
理解了 static 关键字，学会了方法的定义和调用

---

### 学习时间：11:26:04

**📁 文件：`UniqueRandomGenerator.java` - 不重复随机数**

#### 🔍 练习内容
- 尝试了三种方案生成不重复随机数
- 对比了不同集合类的特点
- 详细记录了演进过程

#### 📚 学习知识点
1. **方案一：HashMap**
   ```java
   Map<Integer, Integer> map = new HashMap<>();
   if(map.containsKey(num)) {
       i--;  // 重复则重试
   } else {
       map.put(num, i);
   }
   ```

2. **方案二：HashSet（更简洁）**
   ```java
   HashSet<Integer> set = new HashSet<>();
   while(set.size() < 10) {
       set.add(random.nextInt(100)+1);
   }
   ```

3. **方案三：LinkedHashSet（保持顺序）**
   ```java
   public static LinkedHashSet<Integer> generateUniqueRandoms(...) {
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       while(set.size() < count) {
           set.add(random.nextInt(max - min + 1) + min);
       }
       return set;  // 返回 LinkedHashSet 保持插入顺序
   }
   ```

4. **集合类对比**
   - HashMap：键值对存储，快速查找
   - HashSet：自动去重，无序
   - LinkedHashSet：保持插入顺序

#### 💡 新收获
深入理解了三种集合类的区别，学会了根据需求选择合适的数据结构

---

### 学习时间：12:16:38

**📁 文件：`MultiplicationTable.java` - 乘法表打印**

#### 🔍 练习内容
- 嵌套 for 循环打印三角形乘法表
- 字符串拼接格式化输出

#### 📚 学习知识点
1. **嵌套循环**
   ```java
   for (int i = 1; i <= n; i++) {        // 外层控制行数
       for (int j = 1; j <= i; j++) {    // 内层控制每行的列数
           System.out.print(j + "*" + i + "=" + i * j + " ");
       }
       System.out.println();  // 换行
   }
   ```

2. **格式化输出**
   - 字符串拼接：`j + "*" + i + "=" + i * j`
   - 使用空格分隔每个式子

#### 💡 新收获
掌握了嵌套循环的执行流程，学会了格式化输出

---

### 学习时间：12:21:58

**📁 文件：`PrintArr.java` - 数组打印**

#### 🔍 练习内容
- 遍历数组并格式化打印
- 处理逗号和方括号

#### 📚 学习知识点
1. **数组遍历**
   ```java
   public static void printArr(int[] arr) {
       System.out.print("[");
       for (int i = 0; i < arr.length; i++) {
           if (i == arr.length - 1) {
               System.out.print(arr[i]);
               break;
           } else {
               System.out.print(arr[i] + ", ");
           }
       }
       System.out.print("]");
   }
   ```

2. **关键点**
   - `arr.length` 获取数组长度
   - 最后一个元素不加逗号
   - 使用 break 提前结束循环

#### 💡 新收获
学会了数组的格式化输出，理解了 break 的作用

---

### 学习时间：12:27:51

**📁 文件：`CompareRectangles.java` - 长方形面积比较**

#### 🔍 练习内容
- 定义 Rectangle 类
- 实现面积计算方法
- 比较两个长方形的面积

#### 📚 学习知识点
1. **类的定义**
   ```java
   class Rectangle {
       double length;
       double width;
       
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
   ```

2. **对象作为参数**
   - 方法可以接收对象作为参数
   - 对象调用自己的方法进行比较

#### 💡 新收获
开始理解面向对象的思想，学会用对象思考问题

---

### 学习时间：16:40:18

**📁 文件：`OverloadPractice.java` - 方法重载练习**

#### 🔍 练习内容
- 定义多个同名方法
- 通过参数个数和类型区分
- 测试不同的调用

#### 📚 学习知识点
1. **方法重载**
   ```java
   public static int sum(int a, int b) { return a + b; }
   public static int sum(int a, int b, int c) { return a + b + c; }
   public static int sum(int a, int b, int c, int d) { return a + b + c + d; }
   public static double sum(double a, double b) { return a + b; }
   ```

2. **重载规则**
   - 参数个数不同可以重载
   - 参数类型不同可以重载
   - 仅返回值不同不能构成重载

#### 💡 新收获
理解了方法重载的概念，知道了编译时多态的含义

---

### 学习时间：17:03:57

**📁 文件：`ScoreCalculator.java` - 成绩计算优化**

#### 🔍 练习内容
- 最初写了多次遍历的解法
- 优化为一次遍历同时计算多个统计量
- 返回数组打包多个结果

#### 📚 学习知识点
1. **初始解法（注释保留）**
   ```java
   // 分别计算最大值、最小值、总和 - 需要三次遍历
   int max = 0, min = 0, sum = 0;
   for(int i = 0; i < 5; i++){
       sum += scores[i];
       if(scores[i] > max) max = scores[i];
       if(scores[i] < min) min = scores[i];
   }
   ```

2. **优化解法（一次遍历）**
   ```java
   public static int[] getStatsInOnePass(int[] scores) {
       int max = scores[0];
       int min = scores[0];
       int sum = 0;
       for (int i = 0; i < scores.length; i++) {
           sum += scores[i];
           if (scores[i] > max) max = scores[i];
           if (scores[i] < min) min = scores[i];
       }
       return new int[]{sum, max, min};  // 数组打包返回
   }
   ```

3. **算法优化思维**
   - 时间复杂度从 O(3n) 到 O(n)
   - 一次遍历完成所有统计

#### 💡 新收获
建立了算法优化意识，学会了用数组返回多个值

---

### 学习时间：18:20:55

**📁 文件：`ClassScoreCalculator.java` - 班级成绩统计**

#### 🔍 练习内容
- 统计班级成绩的多个维度
- 计算及格率、平均分
- 输入验证

#### 📚 学习知识点
1. **多维度统计**
   ```java
   // 三个独立方法
   public static int passnumber(int[] scores)  // 及格人数
   public static int sum(int[] scores)         // 总分
   public static int max(int[] scores)         // 最高分
   ```

2. **百分比计算**
   ```java
   System.out.println("及格率是：" + passnumber(scores)*100.0/n);
   System.out.println("平均分是：" + sum(scores)*1.0/n);
   ```
   - 整数转浮点数：乘以 1.0

3. **输入验证**
   ```java
   if (current >= 0 && current <= 100) {
       scores[i] = current;
   } else {
       System.out.println("输入的数字有误！");
       i--;  // 重新输入
   }
   ```

#### 💡 新收获
学会了多维度数据统计，掌握了输入验证的方法

---

### 学习时间：18:46:54

**📁 文件：`ExpressFeeCalculator.java` - 快递费用计算**

#### 🔍 练习内容
- 分段计费的业务逻辑
- 多个方法分工协作
- 输入验证和向上取整

#### 📚 学习知识点
1. **分段计费**
   ```java
   static double calcFeeUnderOne(double kg) {
       return kg * 10;  // 1kg 以下：10 元/kg
   }
   
   static double calcFeeOneToFive(double kg) {
       return 10 + (kg - 1) * 2;  // 1-5kg：首重 10 元，续重 2 元/kg
   }
   
   static double calcFeeOverFive(double kg) {
       return 18 + (kg - 5) * 1.5;  // 5kg 以上：前 5kg18 元，超过部分 1.5 元/kg
   }
   ```

2. **业务逻辑实现**
   ```java
   while (kg <= 0) {
       System.out.println("请输入正确的货物 Kg 数：");
       kg = sc.nextDouble();
   }
   kg = Math.ceil(kg);  // 向上取整
   
   if (kg <= 1) {
       fee = calcFeeUnderOne(kg);
   } else if (kg > 1 && kg <= 5) {
       fee = calcFeeOneToFive(kg);
   } else {
       fee = calcFeeOverFive(kg);
   }
   ```

#### 💡 新收获
学会了用代码实现复杂的业务逻辑，掌握了分段函数的写法

---

## 📅 第四天：2026 年 3 月 18 日（周三）- 算法强化日

### 学习时间：9:31:05

**📁 文件：`RemoveElement.java` - 移除元素**

#### 🔍 练习内容
- 快慢指针技巧
- 原地修改数组
- 对比暴力解法和优化解法

#### 📚 学习知识点
1. **快慢指针模板**
   ```java
   int slow = 0;   // 慢指针，指向新数组的位置
   int fast = 0;   // 快指针，遍历原数组
   while (fast < nums.length) {
       if (nums[fast] != val) {
           nums[slow] = nums[fast];  // 非目标值移到前面
           slow++;  // 慢指针前进
       }
       fast++;  // 快指针始终前进
   }
   return slow;  // 新数组长度
   ```

2. **关键理解**
   - 时间复杂度 O(n)
   - 空间复杂度 O(1) - 原地修改
   - 面试高频题型

#### 💡 新收获
掌握了快慢指针技巧，理解了原地修改的优势

---

### 学习时间：13:55:03

**📁 文件：`RedPacketGenerator.java` - 红包生成器**

#### 🔍 练习内容
- 红包金额随机分配算法
- 保证每人至少 0.01 元
- 金额精度处理

#### 📚 学习知识点
1. **红包算法**
   ```java
   double min = 0.01;
   for (int i = 0; i < people; i++){
       if(i == people - 1){
           redMoney = (double)Math.round(money*100)/100;  // 最后一个人拿走剩余
       } else {
           double max = money - (people - 1 - i) * 0.01;
           redMoney = (Math.random() * (max - min) + min);
           redMoney = (double)Math.round(redMoney * 100) / 100;  // 保留两位小数
           money = money - redMoney;
       }
   }
   ```

2. **关键点**
   - 动态调整随机范围
   - Math.round() 四舍五入
   - 确保总金额不变

#### 💡 新收获
学会了真实的业务场景模拟，掌握了金额精度处理方法

---

### 学习时间：14:47:04

**📁 文件：`MedianOfTwoSortedArrays.java` - 两个有序数组的中位数**

#### 🔍 练习内容
- 归并两个有序数组
- 计算中位数
- 处理奇偶情况

#### 📚 学习知识点
1. **归并排序思想**
   ```java
   int[] arr = new int[m + n];
   while (i < m && j < n) {
       if (nums1[i] >= nums2[j]) {
           arr[k++] = nums2[j++];
       } else {
           arr[k++] = nums1[i++];
       }
   }
   // 处理剩余元素
   while (i < m) { arr[k++] = nums1[i++]; }
   while (j < n) { arr[k++] = nums2[j++]; }
   ```

2. **中位数计算**
   ```java
   return (m + n) % 2 == 0 ? 
       (arr[(m+n)/2] + arr[(m+n)/2-1]) / 2.0 : 
       arr[(m+n)/2];
   ```
   - 偶数：中间两个数的平均值
   - 奇数：中间的数
   - 除以 2.0 转为浮点数

#### 💡 新收获
掌握了归并思想，学会了中位数的计算方法

---

### 学习时间：15:24:56

**📁 文件：`ElectionSimulator.java` - 选举模拟器**

#### 🔍 练习内容
- 模拟投票统计
- 数组下标作为候选人编号
- 计算得票率

#### 📚 学习知识点
1. **数组计数技巧**
   ```java
   int[] votes = new int[6];  // 6 个候选人
   for (int i = 0; i < people; i++) {
       int vote = (int) (Math.random() * 6);
       votes[vote]++;  // 下标对应候选人，值为票数
   }
   ```

2. **打擂台算法**
   ```java
   int max = votes[1];
   int index = 0;
   for (int i = 1; i < 6; i++) {
       if (votes[i] > max) {
           max = votes[i];
           index = i;  // 记录最大值的索引
       }
   }
   ```

3. **得票率计算**
   ```java
   System.out.println("得票率为" + (max * 1.0 / people) * 100);
   ```

#### 💡 新收获
学会了用数组进行统计，掌握了打擂台算法

---

## 📅 第五天：2026 年 3 月 21 日（周六）

### 学习时间：19:38:00

**📁 文件：`SuperLottoSimulator.java` - 双色球模拟器**

#### 🔍 练习内容
- 综合应用 TreeSet、Random、Scanner
- 实现完整的双色球系统
- 复杂的奖项判断逻辑

#### 📚 学习知识点
1. **TreeSet 自动排序**
   ```java
   TreeSet<Integer> front;  // 前区 35 选 5
   TreeSet<Integer> back;   // 后区 12 选 2
   
   while(front.size()<5){
       int num = random.nextInt(35)+1;
       front.add(num);  // 自动排序且不重复
   }
   ```

2. **类的组合**
   ```java
   class Lotto {
       TreeSet<Integer> front;
       TreeSet<Integer> back;
       
       public static Lotto winNumber() { ... }  // 生成中奖号码
       public static Lotto userNumber() { ... } // 用户输入
       public static void checkPrize(...) { ... } // 兑奖
   }
   ```

3. **复杂逻辑判断**
   ```java
   if (frontCount == 5 && backCount == 2) {
       System.out.println("🎉 一等奖！1000 万！");
   } else if (frontCount == 5 && backCount == 1) {
       System.out.println("✨ 二等奖！500 万！");
   }
   // ... 六个奖项等级
   ```

#### 💡 新收获
综合运用所学知识完成了一个完整的项目，理解了类的组合设计

---

## 📅 第六天：2026 年 3 月 23 日（周一）

### 学习时间：10:06:11

**📁 文件：`DogObjectPractice.java` - 小狗对象练习**

#### 🔍 练习内容
- 定义 Dog 类
- 实现数据验证
- 对象行为方法

#### 📚 学习知识点
1. **封装性**
   ```java
   class Dog {
       private String name;
       private int age;
       
       public void setAge(int age1) {
           if (age1 < 0 || age1 > 15) {
               System.out.println("请输入正确的年龄");
           } else {
               age = age1;
           }
       }
   }
   ```

2. **数据验证**
   - setter 方法中加入业务规则检查
   - 保护对象数据的有效性

3. **对象行为**
   ```java
   public void eatBone() {
       System.out.println("年龄是" + age + "的" + name + "正在吃骨头");
   }
   ```

#### 💡 新收获
深入理解了封装的概念，学会了数据验证

---

### 学习时间：11:09:42

**📁 文件：`Students.java` - 学生类**

#### 🔍 练习内容
- 完整的 Student 类设计
- 模拟学生四年的变化
- getter/setter 全套方法

#### 📚 学习知识点
1. **JavaBean 规范**
   ```java
   class Student {
       private String name;
       private int age;
       private int height;
       private int weight;
       
       // getter/setter 全套
       public void setName(String name) { this.name = name; }
       public String getName() { return name; }
       // ... 其他字段
   }
   ```

2. **对象状态变化**
   ```java
   public void lifeShow() {
       System.out.println("大一我叫" + name + "，今年" + age + "岁");
       weight += 10;  // 变胖
       age++;
       System.out.println("大三我瘦了 2KG");
       weight -= 2;
       height += 2;   // 长高
   }
   ```

#### 💡 新收获
掌握了 JavaBean 的设计规范，理解了对象状态的动态变化

---

## 📅 后续天数...

（由于篇幅限制，这里展示了前六天的详细记录。如果需要，我可以继续完成剩余天数的详细学习记录）

---

## 📊 学习总结

### 时间线统计
- **Day 1 (3.15)**: 1 个文件 - LeetCode 起步
- **Day 2 (3.16)**: 2 个文件 - 算法训练
- **Day 3 (3.17)**: 9 个文件 - Java 基础密集训练 ⭐最高强度
- **Day 4 (3.18)**: 4 个文件 - 算法强化
- **Day 5 (3.21)**: 1 个文件 - 综合应用
- **Day 6 (3.23)**: 2 个文件 - 面向对象入门

### 知识体系构建
```
算法基础 → Java 语法 → 集合框架 → 面向对象
   ↓          ↓          ↓          ↓
HashMap   方法/数组  HashSet   封装/继承
双指针    循环/类   TreeSet    多态
二分查找  算法优化  LinkedHashSet
```

### 关键成长点
1. **算法思维**: 从暴力解法到优化算法
2. **数据结构**: 掌握多种集合类的特点和应用场景
3. **面向对象**: 从面向过程到面向对象思维的转变
4. **代码规范**: 注释详细，保留多种解法对比
