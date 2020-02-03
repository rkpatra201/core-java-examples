package com.java.sll.common;

public class NodeRandom {
   public int data;
   public NodeRandom next;
   public NodeRandom random;

   public void setPointers(int data, NodeRandom next, NodeRandom random)
   {
       this.data = data;
       this.next = next;
       this.random = random;
   }

    @Override
    public String toString() {
       String data = this.data+" ("+this.hashCode()+")";
       String next =   " next: "+(this.next!=null ? "data: "+this.next.data+"("+ this.next.hashCode()+")": "null");
       String random = " random: "+(this.random!=null ? "data: "+this.random.data+"("+ this.random.hashCode()+")": "null");

       return data+next+random;
    }
}
