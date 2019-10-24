package com.client;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.*;
import com.exception.*;
import com.services.*;

public class Cliente {

	public static void main(String[] args) throws NamingException, ServicesException{
	
		FamiliaBeanRemote familiaBean = EJBLocator.getInstance().lookup(FamiliaBeanRemote.class);
		UsuarioBeanRemote usuarioBean = EJBLocator.getInstance().lookup(UsuarioBeanRemote.class);
		ProductoBeanRemote productoBean = EJBLocator.getInstance().lookup(ProductoBeanRemote.class);
		LoteBeanRemote loteBean = EJBLocator.getInstance().lookup(LoteBeanRemote.class);


		/**
		 * TESTEO DE MÉTODOS
		 */
		
		/*------------
		 * UsuarioBean
		 -------------*/

//		//.login
//		Usuario usuario = usuarioBean.login("emoroy", "root");
//		System.out.println(usuario);
		
		//.crear
//		Usuario usuario = new Usuario();
//		usuario.setNombre("Prueba");
//		usuario.setApellido("Prueba");
//		usuario.setNombreAcceso("operario");
//		usuario.setContrasena("root");
//		usuario.setCorreo("correo");
//		usuario.setPerfil(new Perfil());
//		System.out.println(usuario.toString());
//		try {
//			usuarioBean.crear(usuario);
//		} catch (ServicesException e) {
//			e.printStackTrace();
//		}
		
		//.crear por parámetros
//		try {
//			usuarioBean.crear("NombreTest", "ApellidoTest", "test", "test", "correo@test.com");
//		} catch (ServicesException e) {
//			e.printStackTrace();
//		}
		
		//.actualizar
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorNombreAcceso("test");
//		Usuario usuarioFind = new Usuario();
//		if (listaUsuarios.size() == 1) {
//			usuarioFind = listaUsuarios.get(0);
//		}
//		usuarioFind.setNombre("testActualizar");
//		try {
//			usuarioBean.actualizar(usuarioFind);
//		} catch (ServicesException e) {
//			e.printStackTrace();
//		}
		
//		//.eliminar
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorNombreAcceso("test");
//		Usuario usuarioFind = new Usuario();
//		if (listaUsuarios.size() == 1) {
//			usuarioFind = listaUsuarios.get(0);
//			System.out.println(usuarioFind.toString());
//		}
//		try {
//			usuarioBean.eliminar(usuarioFind.getId());
//		} catch (ServicesException e) {
//			e.printStackTrace();
//		}
		
		//.asignarPerfilPorId
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorNombreAcceso("test");
//		Usuario usuarioFind = new Usuario();
//		if (listaUsuarios.size() == 1) {
//			usuarioFind = listaUsuarios.get(0);
//			System.out.println(usuarioFind.toString());
//		}
//		try {
//			usuarioBean.asignarPerfilPorId(usuarioFind.getId(), 1L);
//		} catch (ServicesException e) {
//			e.printStackTrace();
//		}
		
		//.asignarPerfil
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorNombreAcceso("test");
//		Usuario usuarioFind = new Usuario();
//		if (listaUsuarios.size() == 1) {
//			usuarioFind = listaUsuarios.get(0);
//			System.out.println(usuarioFind.toString());
//		}
//		try {
//			usuarioBean.asignarPerfil(usuarioFind, "Supervisor");
//		} catch (ServicesException e) {
//			e.printStackTrace();
//		}
		
		//.obtenerTodos
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodos();
//		for (Usuario usuarioFor : listaUsuarios) {
//			System.out.println(usuarioFor.toString());
//		}
//		
		
		//.obtenerTodosPorNombre
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorNombre("Prueba");
//		for (Usuario usuarioFor : listaUsuarios) {
//			System.out.println(usuarioFor.toString());
//		}
		
		//.obtenerTodosPorApellido
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorApellido("ApellidoTest");
//		for (Usuario usuarioFor : listaUsuarios) {
//			System.out.println(usuarioFor.toString());
//		}
		
		//.obtenerTodosPorNombreAcceso
//		List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorNombreAcceso("test");
//		for (Usuario usuarioFor : listaUsuarios) {
//			System.out.println(usuarioFor.toString());
//		}
		
		/*--------------
		 * FamiliaBean
		 ---------------*/
		
//		crear
//		Familia familia = new Familia();
//		familia.setCodigo("T001");
//		familia.setDescripcion("DescripcionPrueba");
//		familia.setIncompatible("IncompatPrueba");
//		familia.setNombre("test");
//		try {
//			List<Usuario> usuarios= usuarioBean.obtenerTodosPorNombreAcceso("emoroy");
//			familiaBean.crear(familia, usuarios.get(0));
//		}catch (ServicesException e) {
//			System.out.println(e.getMessage());
//		}
		
		//crear con params
//		try {
//			List<Usuario> usuarios= usuarioBean.obtenerTodosPorNombreAcceso("emoroy");
//			familiaBean.crear("Test002", "FamiliaTestConParams", "IncompatTest", "TestCrearConParams", usuarios.get(0));
//		}catch (ServicesException e) {
//			System.out.println(e.getMessage());
//		}
		
		//actualizar
//		try {
//			List<Familia> familias = familiaBean.obtenerTodosPorCodigo("Test002");
//			List<Usuario> usuarios= usuarioBean.obtenerTodosPorNombreAcceso("emoroy");
//			familias.get(0).setDescripcion("Test .actualizar");
//			familiaBean.actualizar(familias.get(0), usuarios.get(0));
//		}catch (ServicesException e) {
//			System.out.println(e.getMessage());
//		}
		
		//eliminar
//		try {
//			List<Familia> familias = familiaBean.obtenerTodosPorCodigo("Test002");
//			List<Usuario> usuarios= usuarioBean.obtenerTodosPorNombreAcceso("emoroy");
//			familiaBean.eliminar(familias.get(0), usuarios.get(0));
//		}catch (ServicesException e) {
//			System.out.println(e.getMessage());
//		}
		
		//eliminar por id
//		try {
//			List<Usuario> usuarios= usuarioBean.obtenerTodosPorNombreAcceso("emoroy");
//			familiaBean.eliminar(3L, usuarios.get(0));
//		}catch (ServicesException e) {
//			System.out.println(e.getMessage());
//		}
		
		//obtenerTodos
//		List<Familia> listaFamilias = familiaBean.obtenerTodos();
//		for (Familia familiaFor : listaFamilias) {
//			System.out.println(familiaFor.toString());
//		}
		
		//.obtenerTodosPorCodigo
//		List<Familia> listaFamilias = familiaBean.obtenerTodosPorCodigo("T001");
//		for (Familia familiaFor : listaFamilias) {
//			System.out.println(familiaFor.toString());
//		}
		
		//.obtenerTodosPorNombre
//		List<Familia> listaFamilias = familiaBean.obtenerTodosPorNombre("test");
//		for (Familia familiaFor : listaFamilias) {
//			System.out.println(familiaFor.toString());
//		}
		
		//.obtenerTodosDescripcion
//		List<Familia> listaFamilias = familiaBean.obtenerTodosPorDescripcion("FamiliaTestConParams");
//		for (Familia familiaFor : listaFamilias) {
//			System.out.println(familiaFor.toString());
//		}
		
//		validarAlta
//		validarModificacion
//		validarBaja
//		usuarioTienePermisos
//		codigoExiste
//		nombreExiste
//		descripcionExiste
//		descripcionSuperaMaximoDeCaracteres
//		tieneProductoAsociado
		
		/*--------------
		 * LoteBean
		 ---------------*/
		
//		crear
//		crear con params
//		actualizar
//		eliminar
//		eliminar por id
//		obtenerTodos
//		obtenerTodosPorCodigo
//		validarAlta
//		validarModificacion
//		validarBaja
//		usuarioTienePermisos
//		codigoExiste
//		fechaVencimientoEsMayor
//		tieneAlamcenamientoAsociado
//		tienePerdidaAsociada
		
		/*--------------
		 * ProductoBean
		 ---------------*/
		
		//crear
//		Producto producto = new Producto();
//		producto.setCodigo("T002");
//		producto.setEstiba("EstibaPrueba");
//		producto.setNombre("NombrePrueba");
//		producto.setPeso(new BigDecimal(3.2));
//		producto.setSegmentacion("SegmentacionPrueba");
//		producto.setStockMinimo(new BigDecimal(22));
//		producto.setStockTotal(new BigDecimal(345));
//		producto.setVolumen(new BigDecimal(423));
//		System.out.println(producto.toString());
//		try {
//			List<Usuario> listaUsuarios = usuarioBean.obtenerTodosPorNombreAcceso("emoroy");
//			List<Familia> listaFamilias = familiaBean.obtenerTodosPorCodigo("T001");
//			productoBean.crear(producto, listaUsuarios.get(0), listaFamilias.get(0));
//		}catch(ServicesException e) {
//			e.printStackTrace();
//		}
		
//		crear con params
//		actualizar
//		eliminar
//		eliminar por id
//		asignarFamiliaPorId
//		asignarFamilia
//		asignarUsuarioPorId
//		asignarUsuario
//		obtenerTodos
//		obtenerTodosPorCodigo
//		obtenerTodosPorNombre
//		validarAlta
//		validarModificacion
//		validarBaja
//		usuarioTienePermisos
//		codigoExiste
//		nombreExiste
//		nombreSuperaMaximoDeCaracteres
//		tienePedidoAsociado
		
		
	}

}
