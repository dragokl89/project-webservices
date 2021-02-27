/**
 * 
 */
package com.devpredator.projectwebservices.servie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectwebservices.entity.Empleado;

/**
 * @author c-ado
 *
 */
public class EmpleadoService {
	/**
	 * metodo que permite consutar un empleado por su numero
	 * 
	 * @param numeroEmpleado {@link String} numero del empleado
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleadoId(String numeroEmpleado) {
		List<Empleado> empleados = this.consultarEmpleados();

		for (Empleado empleado : empleados) {
			if (empleado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleado;
			}
		}
		return null;
	}

	/**
	 * Metodo que simula la consulta de un empleado
	 * 
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNombre("Carlos");
		empleado.setPrimerApellido("Orbe");
		empleado.setNumeroEmpleado("123");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(21);

		return empleado;
	}

	/**
	 * permite consultar la lista de empleados
	 * 
	 * @return {@link List} lista de empleados
	 */
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList();
		Empleado empleado = new Empleado();
		empleado.setNombre("Carlos");
		empleado.setSegundoApellido("Intriago");
		empleado.setPrimerApellido("Orbe");
		empleado.setNumeroEmpleado("123");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(21);

		Empleado empleadoNuevo = new Empleado();
		empleadoNuevo.setNombre("Pablo");
		empleadoNuevo.setPrimerApellido("Caiza");
		empleadoNuevo.setSegundoApellido("Yoquese");
		empleadoNuevo.setNumeroEmpleado("456");
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		empleadoNuevo.setEdad(21);

		empleados.add(empleado);
		empleados.add(empleadoNuevo);
		return empleados;
	}
}
