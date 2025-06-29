#!/bin/bash

# 创建输出目录
mkdir -p target/classes

# 编译所有Java文件
echo "编译游戏..."
javac -d target/classes src/main/java/com/game/*.java

# 检查编译是否成功
if [ $? -eq 0 ]; then
    echo "编译成功，启动游戏..."
    # 运行游戏
    java -cp target/classes com.game.PlaneWar
else
    echo "编译失败，请检查错误信息"
fi