package pq2.menu;

/**
 * 
 * @author fernando
 *	Esta es la <b><i>interface</i></b> con la manera de ser de un menú.
 */
public interface IMenu {
	/**
	 * @param op Añade este nuevo texto como una nueva opción del menu. 
	 * Lo hará posicionándola al final de las ya existentes.
	 * Si ocupa la primera posición (o es la primera opción añadida)
	 * se considerará la opción seleccionada por defecto.   
	 * @throws MenuIllegalEstateException
	 * En caso de que ya se haya utilizado alguna vez las funciones next, previous, select o read.
	 */
	void add(String op);
	/**
	 * @param pos La posición en la que se insertará la nueva opción. 
	 * Lo hará colocándola en la posición relativa indicada en el parámetro pos.
	 * @param op Añade este nuevo texto como una nueva opción del menu. 
	 * Lo hará colocándola en la posición relativa indicada en el parámetro pos.
	 * Si ocupa la primera posición (o es la primera opción añadida)
	 * se considerará la opción seleccionada por defecto.   
	 * @throws MenuIllegalEstateException
	 * En caso de que ya se haya utilizado alguna vez las funciones next, previous, select o read.
	 * @throws MenuIndexOutOfBoundsException en caso de que la nueva opción se intente colocar 
	 * en una posición menor que cero o mayor o igual que el número de opciones que actualmente tenga la lista.
	 */
	void add(int pos, String op);
	/**
	 * Cambia la opcion actualmente selecionada por la siguiente opción del menú.
	 * La siguiente opción a la última se puede considerar la primera,
	 * o que no hay siguiente.
	 * @return La posición seleccionada como actual tras haberse ejecutado.
	 */
	int next();
	/**
	 * Cambia la opcion actualmente selecionada por la anterior opción del menú.
	 * La anterior opción a la primera, se puede considerar la última,
	 * o bien que no hay anterior.
	 * @return La posición seleccionada como actual tras haberse ejecutado.
	 */
	int previous();
	
	/**
	 * Cambia la opcion actualmente selecionada del menú por la indicada
	 * en el parámetro. 
	 * 
	 * @param pos es la posición de la nueva opción seleccionada
	 * 
	 * @throws MenuIndexOutOfBoundsException en caso de que la nueva posición 
	 * indicada sea menor que cero o mayor que el número de opciones que actualmente tenga la lista.
	 */
	void select(int pos);
	/**
	 * Permite consultar cual es la opción actualmente seleccionada en el menú 
	 * 
	 * @return la posición relativa de la opción actualmente seleccionada en el menú
	 */
	int read();
	/**
	 * Permite consultar el texto de la opción ubicada en la posición del menú 
	 * @param pos Es la posición de la opción cuyo texto se pretende consultar. 
	 * @return El texto de la opción de la posición solicitada 
	 * 
	 * @throws MenuIndexOutOfBoundsException en caso de que la nueva posición 
	 * indicada sea menor que cero o mayor que el número de opciones que actualmente tenga la lista.
	 */
	String get(int pos);
}
