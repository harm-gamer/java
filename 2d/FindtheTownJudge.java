// In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

// If the town judge exists, then:

//     The town judge trusts nobody.
//     Everybody (except for the town judge) trusts the town judge.
//     There is exactly one person that satisfies properties 1 and 2.

// You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.

// Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

 
public class FindtheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n==1){
            return n;
        }
      int[] trustCount = new int[n+1];
      boolean [] trustOthers = new boolean[n+1];
      
      for(int [] relation : trust){
          int a = relation[0];
          int b  = relation[1];
          
          trustCount[b]++;
          trustOthers[a] = true;
      }
      
      for(int i = 0;i<=n;i++){
          
          if(trustCount[i] == n-1 && (!trustOthers[i])){
              return i;
          }
      }
      return -1;
  }
}
