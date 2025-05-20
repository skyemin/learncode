# 飞机大战游戏

一个简单的Java Swing实现的飞机大战游戏。

## 游戏说明

在这个游戏中，玩家控制一架蓝色飞机在屏幕下方移动，躲避从上方下落的红色敌机，并通过发射黄色子弹击毁敌机获取分数。

## 控制方式
- 方向键（上下左右）：控制飞机移动
- 空格键：发射子弹

## 游戏规则
- 每击毁一个敌机获得10分
- 如果被敌机撞到，游戏结束

## 如何运行
确保你的系统安装了Java（推荐JDK 8或更高版本）。

### 编译和运行
```
javac -d target/classes src/main/java/com/game/*.java
java -cp target/classes com.game.PlaneWar
```

## 项目结构
- `PlaneWar.java`: 主游戏类，包含游戏逻辑和UI
- `Player.java`: 玩家飞机类
- `Enemy.java`: 敌机类
- `Bullet.java`: 子弹类

## 开发者
此游戏为学习Java Swing编程的示例项目。