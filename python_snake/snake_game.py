import pygame
import time
import random

# 初始化pygame
pygame.init()

# 定义颜色
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (213, 50, 80)
GREEN = (0, 255, 0)
BLUE = (50, 153, 213)

# 设置屏幕大小
width, height = 600, 400
screen = pygame.display.set_mode((width, height))
pygame.display.set_caption('Python贪吃蛇')

# 设置贪吃蛇的移动速度
snake_block = 10
snake_speed = 15

# 显示分数
font_style = pygame.font.SysFont("bahnschrift", 25)
score_font = pygame.font.SysFont("comicsansms", 35)

def display_score(score):
    """显示分数"""
    value = score_font.render("得分: " + str(score), True, WHITE)
    screen.blit(value, [0, 0])

def draw_snake(snake_block, snake_list):
    """绘制蛇身"""
    for x in snake_list:
        pygame.draw.rect(screen, GREEN, [x[0], x[1], snake_block, snake_block])

def message(msg, color):
    """显示信息"""
    mesg = font_style.render(msg, True, color)
    screen.blit(mesg, [width / 6, height / 3])

def game_loop():
    """游戏主循环"""
    game_over = False
    game_close = False

    # 蛇的初始位置
    x1 = width / 2
    y1 = height / 2

    # 初始移动方向
    x1_change = 0
    y1_change = 0

    # 初始化蛇身
    snake_list = []
    length_of_snake = 1

    # 生成第一个食物
    foodx = round(random.randrange(0, width - snake_block) / 10.0) * 10.0
    foody = round(random.randrange(0, height - snake_block) / 10.0) * 10.0

    # 设置游戏时钟
    clock = pygame.time.Clock()

    # 游戏主循环
    while not game_over:
        
        # 游戏结束处理
        while game_close:
            screen.fill(BLACK)
            message("游戏结束! 按Q-退出 或 C-再玩一次", RED)
            display_score(length_of_snake - 1)
            pygame.display.update()

            # 处理游戏结束时的按键
            for event in pygame.event.get():
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_q:
                        game_over = True
                        game_close = False
                    if event.key == pygame.K_c:
                        game_loop()
                elif event.type == pygame.QUIT:
                    game_over = True
                    game_close = False

        # 处理按键事件
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                game_over = True
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_LEFT and x1_change != snake_block:
                    x1_change = -snake_block
                    y1_change = 0
                elif event.key == pygame.K_RIGHT and x1_change != -snake_block:
                    x1_change = snake_block
                    y1_change = 0
                elif event.key == pygame.K_UP and y1_change != snake_block:
                    y1_change = -snake_block
                    x1_change = 0
                elif event.key == pygame.K_DOWN and y1_change != -snake_block:
                    y1_change = snake_block
                    x1_change = 0

        # 检查是否撞墙
        if x1 >= width or x1 < 0 or y1 >= height or y1 < 0:
            game_close = True

        # 更新蛇的位置
        x1 += x1_change
        y1 += y1_change
        screen.fill(BLACK)
        
        # 绘制食物
        pygame.draw.rect(screen, RED, [foodx, foody, snake_block, snake_block])
        
        # 更新蛇身
        snake_head = []
        snake_head.append(x1)
        snake_head.append(y1)
        snake_list.append(snake_head)
        
        # 如果蛇身长度超过当前得分，删除多余的部分
        if len(snake_list) > length_of_snake:
            del snake_list[0]

        # 检查是否撞到自己
        for x in snake_list[:-1]:
            if x == snake_head:
                game_close = True

        # 绘制蛇身
        draw_snake(snake_block, snake_list)
        display_score(length_of_snake - 1)
        
        pygame.display.update()

        # 检查是否吃到食物
        if x1 == foodx and y1 == foody:
            # 生成新的食物位置
            foodx = round(random.randrange(0, width - snake_block) / 10.0) * 10.0
            foody = round(random.randrange(0, height - snake_block) / 10.0) * 10.0
            # 增加蛇的长度
            length_of_snake += 1
        
        # 控制游戏速度
        clock.tick(snake_speed)

    # 退出游戏
    pygame.quit()

# 运行游戏
if __name__ == "__main__":
    game_loop()