package com.air.structure.Queue;

import java.util.Scanner;
//该方法实现的队列只能使用一次，不能复用
public class QueueTest01 {
    public static void main(String[] args) {//数组模拟队列
        System.out.println("Hello world");
        Queue queue = new Queue(4);
        boolean loop = true;
        while (loop) {
            System.out.println("a:添加数据");
            System.out.println("g:获取数据");
            System.out.println("s:查看队列");
            System.out.println("h:查看头数据");
            Scanner scanner =new Scanner(System.in);
            String x = scanner.next();
            int y;
            switch (x)
            {
                case "a":
                    System.out.println("请输入一个数据");queue.addQueue(y=scanner.nextInt());break;
                case "g":try {
                    System.out.println(queue.getQueue());break;
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());break;
                }
                case "s":try {
                    queue.showQueue();break;
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());break;
                }
                case "h":try {
                    System.out.println(queue.headQueue());break;
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }

        /*int get = queue.getQueue();
        System.out.println(get);*/
        }
    }
}

class Queue{
    private int MaxSize;
    private int front;
    private int rear;
    private int[] arr;
    public Queue(int arrMaxSize){
        MaxSize = arrMaxSize;
        front = -1;
        rear = -1;
        arr = new int[MaxSize];
    }
    public boolean isFull(){//判断队列是否为满
        return rear == MaxSize-1;
    }
    public boolean isEmpty(){//判断队列是否为空
        return rear == front;
    }
    public void addQueue(int n){//添加数据到队列
        //先判断队列是否为满
        if(isFull()){
            System.out.println("F队列已满，不能添加数据！");
            return;
        }
        rear++;
        arr[rear] = n;
    }
    public int getQueue() {//获取队列的数据，出队列
        //判断队列是否为空
        if (isEmpty()) {
            //通过抛出异常
            throw new RuntimeException("G队列空，不能获取数据！");
        }
        front++;
        return arr[front];
    }
    public void showQueue(){//显示队列的所有数据
        //遍历
        if(isEmpty()){
            System.out.println("S队列为空，没有数据！");
            return;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    public int headQueue(){//显示队列的头数据
        //判断
        if(isEmpty()){
            throw new RuntimeException("H队列为空，无头数据");
        }
        return arr[front+1];
    }
}
