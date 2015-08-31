package my.learn.code.algorithm;


public class ReverseList {

	/**
	 * @Description:翻转链表
	 * @param @param args
	 * @return void
	 */
	public static void main(String[] args) {
		//A->B->C->D-E
		//A<-B C->D->E
		//   p q  r
		//A<-B<-C D->E
		//      p q  r
		
		Node<String> head=null;
		new ReverseList().reverse(null, head);
		
	
		

	}

	public  <E> Node<E> reverse(Node<E> p,Node<E> q){
		if(q==null) return null;
		Node<E> r=q.next;
		q.next=p;
		if(r==null){
			return q;
		}
		p=q;
		q=r;
		
		return reverse(p, q);
		
	}
	
	private static class Node<E>{
		E item;
		Node<E> next;
		
		
		
	}
}
