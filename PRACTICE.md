  ## 02
- 2-2
  - 1, 2, 4, 5
  - 正答：2,4,5,7

## 03
- 3-1
```Java
if (weight == 60) {
    System.out.println("1");
}

if (age1 + age2 >= 60) {
    System.out.println("2");
}

if (age%2 == 1) {
    System.out.println("3");
}

if (name == "湊"){
    System.out.println("4");
}
```

- 3-2
  - C,D,E

- 3-4 
  - else後に{}を追加する。

## 04
- 4-3
  - 5行目：NullPointerException
  - 6行目：ArrayIndexOutOfBoundsException


## 06
- 6-3 クラスパスがc:\work\ex64の時、どう変更すればよいか
  - 現在のchapter06/practice01/...の構成をc:\work\ex64\practice01という感じにして、パッケージの根をex64配下とする事で実現できる。
- 6-4
  - パッケージが同じになっているんだとしたら、commentになっている。

## 07
- 7-1
  - レジ
  - 計算機
  - 信号機　等

- 7-2
 - 1. 航空管制システム
   - 飛行機オブジェクト
   - 空港オブジェクト
  - 2. 映画の詳細プログラム
    - 映画館オブジェクト
    - 映画オブジェクト
    - 俳優オブジェクト
  - 3. 余っている食材での料理おすすめアプリ
    - 食材オブジェクト
    - 料理オブジェクト
    - レシピオブジェクト

- 7-3
  - 案内係オブジェクト
    - 行動責任
      - 希望条件を聞く
      - 条件に合った観光地を探す
    - 情報保持責任
      - 聞いた希望条件の保持
  - 観光地オブジェクト
    - 行動責任
    - 情報保持責任
      - 名前
      - 所在地
      - 電話番号
      - 解説
- 9-2
  ```shell
    25 : 25
    25 : 35
  ```
  【出力の理由】
  - heal(baseHp)は、baseHpの中身の値(25)を渡しており、baseHpそのものの変化は無いから。
  - heal(t)ではThief型の参照を渡しており、healメソッド内で、
  渡された参照先のオブジェクトのhpフィールドの値を変更しているから。

## 10
- 10-1
  - ２，３，５
- 10-2
  - iphone -> Phone -> Electronic Device
  - Fit -> Car -> vehicle
  - 広辞苑 -> Dictionary -> Book

## 11
- 11-2
  - ア：Asset　イ：Intangible　ウ：Patent


## 12
- 12-1
  - (1)
    - Sword
    - Item
    - Sword
    - Item
  - (2)
    - Monster
    - Slime
    - Slime
    - Monster
- 12-2
  - 1
    - a()
  - 2
    - AaBa
- 12-3
  - Y[]型

## 13
- 13-2
  - `this.wand.power` にて `private` で定義された変数に対して, Wizardからアクセスしようとしているため
- 13-3
  - Wandにゲッターセッターの追加