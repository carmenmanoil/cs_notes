import java.util.*;
public class J5_2018_ChooseYourOwnPath{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] vis = new boolean[n];
        in.nextLine();
        ArrayList<Integer> ends = new ArrayList<>();
        int[][] tree = new int[n][];
        for(int i=0; i<n; i++){
            int size = in.nextInt();
            tree[i]=new int[size];
            if(size==0){
                ends.add(i);
                in.nextLine();
                continue;
            }
            
 
            
            for(int j=0; j<size; j++){
                tree[i][j]=in.nextInt()-1;
            }
        }
        int deg = 1;
        int ans2=1;
        boolean smallest = false;
        int v = 0;
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qdeg = new LinkedList<>();
        vis[0]=true;
        while(true){
            for(int i=0; i<tree[v].length; i++){
                if(v==tree[v][i]){
                    continue;
                }
                if(!vis[tree[v][i]]){
                    vis[tree[v][i]]=true;
                    q.add(tree[v][i]);
                    qdeg.add(deg+1);
                }
                if(!smallest){
                    for(int j=0; j<ends.size(); j++){
                        if(ends.get(j)==tree[v][i]){
                            smallest=true;
                            ans2=deg+1;
                            break;
                        }
                    }
                    
                }
            }
            try{
                v=q.remove();
                deg=qdeg.remove();
            }
            catch(NoSuchElementException e){
                break;
            }
        }
        boolean ans=true;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                ans=false;
                break;
            }
        }
        if(ans){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println(ans2);
    }
}