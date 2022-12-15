/*class Link {
	public Object data;
	public Link next;

	public Link(Object o) {
		this.data = o;
		this.next = null;
	}

	public String toString() {
		return data.toString();
	}
}*/

class LinkList {
	private Link head;

	public LinkList() {
		head = null;
	}

	public void insertFirst(Object o) {
		Link newLink = new Link(o);
		newLink.next = head;
		head = newLink;
	}

	public Object removeFirst() {
		Object res = head.data;
		head = head.next;
		return res;
	}

	public Object getFirst() {
		return head.data;
	}

	public void insertLast(Object o) {
		Link newLink = new Link(o);
		if (head == null) {
			head = newLink;
			return;
		}
		Link current = head;
		while (current.next != null)
			current = current.next;
		current.next = newLink;
	}

	public Object removeLast() {
		if (head.next == null) {
			Object res = head.data;
			head = null;
			return res;
		}
		Link current = head;
		while (current.next.next != null)
			current = current.next;
		Object res = current.next.data;
		current.next = null;
		return res;
	}

	public Object getLast() {
		Link current = head;
		while (current.next != null)
			current = current.next;
		return current.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		if (head == null)
			return "[ ]";
		String res = "[ " + head.data;
		Link current = head.next;
		while (current != null) {
			res += ", " + current.data;
			current = current.next;
		}
		res += " ]";
		return res;
	}
	public void reverse(){
		LinkList l = new LinkList();
		Link current = head;
		while (current != null){
			Link k = new Link(current.data);
			k.next = l.head;
			l.head = k;
			current = current.next;
		}

	}
	public LinkList MulTillENd(){
		LinkList a = new LinkList();
		Link current1 = head;
		Link current2 = head;
		int Num = 1;
		while (current2 != null){
			while (current1 != null){
				Num *= (int)current1.data;
				current1 = current1.next;
			}
			Link info = new Link(Num);
			if (a.head == null) {
				a.head = info;
			}else {
				Link current3 = a.head;
				while (current3.next != null){
						current3 = current3.next;
				}
				current3.next = info;
			}

			Num = 1;
			current2 = current2.next;
			current1 = current2;
		}
		return a;
	}
	public boolean subsetDifference(int n){
		Link current = head;
		Link previous = head;
		while (current.next != null){
			current = current.next;
			if ((int)current.data - (int) previous.data == n){
				return true;
			}
			previous = current;
		}
		return false;
	}
	public LinkList deleteEvenPosition(){
		int i = 1;
		LinkList a = new LinkList();
		head = head.next;
		Link current = head;
		Link previous = head;
		while (current.next != null){
			current = current.next;
			if (i%2 == 1){
				previous.next = current.next;
			}
			i++;
			previous = current;
		}
		a.head = head;
		return a;
	}
	public LinkList extractNonDuplicates(){
		LinkList a = new LinkList();
		Link current = head;
		boolean check = false;
		while (current != null){
			Link current2 = a.head;
			while (current2 != null){
				if (current2.data.equals(current.data)){
					check = true;
				}
				current2 = current2.next;
			}
			if (!check){
				Link b = new Link(current.data);
				if (a.head == null){
					a.head = b;
				}
				else {
					Link current3 = a.head;
					while (current3.next != null){
						current3 = current3.next;
					}
					current3.next = b;
				}
			}
			current = current.next;
			check = false;
		}
		return a;
	}
	
	
}
