# 課題 2-1
式と演算子

### 課題の説明
次のプログラムを修正し、正しい実行結果が得られるプログラムにせよ。

修正前のプログラム (Prog21.java)
``` java
public class Prog21 {
    public static void main(String[] args) {
        int x=2;
        int y=7;
        String sikiA = "x+y = ";
        String sikiB = "y/x = ";
        System.out.println("x=" + 2 + ",y=" + 7 +"とすると、");
        System.out.println(sikiA + x+y);
        System.out.println(sikiB + y/x);
    }
}
```

修正前の実行結果
```
x=2,y=7とすると、
x+y = 27
y/x = 3
```

正しい実行結果
```
x=2,y=7とすると、
x+y = 9
y/x = 3.5
```