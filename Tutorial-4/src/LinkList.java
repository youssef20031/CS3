import java . text . SimpleDateFormat ;
import java . util . Calendar ;
import java . util . Date ;
class Link {
	String url ;
	String date ; // Format YYYY - MM - DD
	int frequency ; // number of times a url has been visited
	public Link ( String url ) {
		this . url = url ;
		this . frequency = 0;
// gets the current date
		Calendar cal = Calendar . getInstance ();
		Date calDate = cal . getTime ();
// and convert it into YYYY - MM - DD
		SimpleDateFormat format1 = new SimpleDateFormat ( " yyyy - MM - dd " );
		try {
			date = format1 . format ( calDate );
		}
		catch ( Exception e ){
			e . printStackTrace();
		}
	}
	public Link ( String url , int frequency ) {
		this ( url );
		this . frequency = frequency ;
	}
	public String toString (){
		return url + " ␣ " + date + " ␣ frequency ␣ " + frequency ;
	}
}