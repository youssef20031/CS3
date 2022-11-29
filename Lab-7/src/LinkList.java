class Link {
	public Object data;
	public Link next;

	public Link(Object o) {
		this.data = o;
		this.next = null;
	}

	public String toString() {
		return data.toString();
	}
}

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
	public void cutList(){
		Link current = head;
		int Size = 0;
		while (!(current == null)){
			Size++;
			current = current.next;
		}
		current = head;
		while (!(current.next == null)){
			current = current.next;
		}
		current.next = head;
		for (int i = 0; i<Size/2 + Size%2;i++){
			current = current.next;
		}
		head = current;
		for (int i = 0; i<Size/2 + Size%2;i++){
			current = current.next;
		}
		current = null;

	}

	
}
