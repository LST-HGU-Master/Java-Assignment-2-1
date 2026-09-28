# 課題 2-1: 式と演算子

### 課題の説明
次の「修正前のプログラム」に実行時引数（2と7）をセットして実行すると以下の「修正前の実行結果」が得られる。しかしながら、2と7の和および7と2の商として期待されるのは、「正しい実行結果」に示したそれぞれ9と3.5である。また、実行時引数に3と9をセットした時にはそれぞれ12と3.0が得られるようにしたい。そこで「修正前のプログラム」を書き換えて、「正しい実行結果」が得られるプログラムにせよ。
ただし、プログラム中に含まれる以下の2行
```
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
```
は変更しないこと。


### 修正前のプログラム
``` java
public class Prog21 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        String sikiA = "x+y = ";
        String sikiB = "y/x = ";
        System.out.println("x=" + 2 + ",y=" + 7 +"とすると、");
        System.out.println(sikiA + x+y);
        System.out.println(sikiB + y/x);
    }
}
```

### 修正前の実行結果（実行時引数が2,7のとき）
```
x=2,y=7とすると、
x+y = 27
y/x = 3
```

### 正しい実行結果（実行時引数が2,7のとき）
```
x=2,y=7とすると、
x+y = 9
y/x = 3.5
```

### 正しい実行結果（実行時引数が3,9のとき）
```
x=3,y=9とすると、
x+y = 12
y/x = 3.0
```
