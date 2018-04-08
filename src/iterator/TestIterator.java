package iterator;

import java.util.Iterator;



public class TestIterator<E> implements Iterator<E> {
	private Object[] elem = {"a","b","c",123};
	private int size =elem.length;
	//�α�
	private int coursor=-1;
	
	//�ж��Ʒ�����һ��
	public  boolean hasNext() {
		
		return coursor+1<size;
	}
	//��ȡ��һ��
	public E next() {
		coursor++;
		return (E) elem[coursor];
	}
	//ɾ����һ��
	public void remove() {
	System.arraycopy(elem, coursor+1, elem, coursor, this.size-(coursor+1));
	this.size --;
	coursor--;
	}
	//����������Զ�����һ������
	public Iterator<E> iterator() {
		return new TestIterator<E>() {
			
		};
	}
	public static void main(String[] args) {
		TestIterator<Object> list = new TestIterator<Object>();
		Iterator<Object> a    =list.iterator();
		System.out.println(list.next());
		System.out.println(list.next());
		System.out.println(list.next());
		list.remove();
		System.out.println(list.size);
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
	}
}
