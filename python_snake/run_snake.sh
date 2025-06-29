#!/bin/bash

echo "检查 Python 是否已安装..."
if ! command -v python3 &> /dev/null; then
    echo "Python 未找到。请安装 Python 3.6 或更高版本。"
    exit 1
fi

echo "检查 Pygame 是否已安装..."
if ! python3 -c "import pygame" &> /dev/null; then
    echo "Pygame 未安装，正在尝试安装..."
    python3 -m pip install pygame
    if [ $? -ne 0 ]; then
        echo "Pygame 安装失败。请手动运行: pip install pygame"
        exit 1
    fi
fi

echo "启动贪吃蛇游戏..."
python3 snake_game.py