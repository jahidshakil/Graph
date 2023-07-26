import java.util.ArrayList;

import javax.swing.plaf.nimbus.State;

class Graph {
    

    static class Edge {
        int src;
        int dst;

        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }


    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // 0->{0,2}
        // 1->{1,2}, {1,3}, {1,4}
        //2->{2,0}, {2,1}, {2,3}
        //3->{3,1} {3,2}
        graph[0].add(new Edge(0, 2)); 
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));

    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        // print 2's neighbours
        for(ArrayList<Edge> p: graph){
            for (int i = 0; i < p.size(); i++) {
                Edge e = p.get(i);
                System.out.print(e.dst + " ");
            }
        System.out.println();
        }
    }
}