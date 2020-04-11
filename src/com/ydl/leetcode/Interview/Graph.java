package com.ydl.leetcode.Interview;

import java.util.LinkedList;

//定义顶点
class Vertex{
    int data;
    public Vertex(int data){
        this.data = data;
    }
}
//定义图 使用邻接表形式
public class Graph {

    private int size;
    private Vertex[] vertexes;
    private LinkedList<Integer> adj[];

    public Graph(int size){
        this.size = size;
        //初始化顶点和邻接矩阵
        vertexes = new Vertex[size];
        adj = new LinkedList[size];
        for (int i = 0;i < size;i++){
            vertexes[i] = new Vertex(i);
            adj[i] = new LinkedList<>();
        }
    }

    //深度优先遍历
    public static void dfs(Graph graph,int start,boolean[] visited){

        System.out.println(graph.vertexes[start].data);
        visited[start] = true;
        for (int index : graph.adj[start]){
            if (!visited[index]){
                dfs(graph,index,visited);
            }
        }

    }

    //广度优先遍历
    public static void bfs(Graph graph,int start,boolean[] visited,LinkedList<Integer> queue){

        queue.offer(start);
        while(!queue.isEmpty()){
            int front = queue.poll();
            if (visited[front]){
                continue;
            }
            System.out.println(graph.vertexes[front].data);
            visited[front] = true;
            for (int index:graph.adj[front]){
                queue.offer(index);
            }
        }

    }

    public static void main(String[] args) {
        Graph grahp = new Graph(6);

        grahp.adj[0].add(1);
        grahp.adj[0].add(2);
        grahp.adj[0].add(3);

        grahp.adj[1].add(0);
        grahp.adj[1].add(3);
        grahp.adj[1].add(4);

        grahp.adj[2].add(0);

        grahp.adj[3].add(0);
        grahp.adj[3].add(1);
        grahp.adj[3].add(4);
        grahp.adj[3].add(5);

        grahp.adj[4].add(1);
        grahp.adj[4].add(3);
        grahp.adj[4].add(5);

        grahp.adj[5].add(3);
        grahp.adj[5].add(4);
        dfs(grahp,0,new boolean[grahp.size]);
        bfs(grahp,0,new boolean[grahp.size],new LinkedList<>());
    }
}
