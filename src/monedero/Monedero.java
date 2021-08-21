package monedero;



public class Monedero {

	
		private double dinero;
		public Monedero(double dineroInicial) {
			dinero = dineroInicial; 
		}
		
		public void ingresarDinero( double dineroAIngresar ) {
			dinero+=dineroAIngresar;}	
		
		public double sacarDinero( double dineroASacar ) {
			if (dinero >= dineroASacar) {
				dinero-= dineroASacar; 
				return dineroASacar;  
			}
			else 
				return 0;  
			
		}   
		double verCuantoDineroQueda() {
			return dinero; 
		}
		
	public static void main(String[] args) {
		Monedero miMonederoRosa = new Monedero(1000);
		double disponible = miMonederoRosa.verCuantoDineroQueda();
	System.out.println(disponible);
	miMonederoRosa.sacarDinero(300);
	 disponible = miMonederoRosa.verCuantoDineroQueda();
	System.out.println(disponible);
	miMonederoRosa.ingresarDinero(500);
	 disponible = miMonederoRosa.verCuantoDineroQueda();
		System.out.println(disponible);
	
}
}
