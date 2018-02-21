package beans;

import java.time.LocalDateTime;

public class Movimiento {
	private int idMovimiento;
	private double cantidad;
	private String operacion;
	private int idCuenta;
	private LocalDateTime fecha;
	public Movimiento(int idMovimiento, double cantidad, String operacion, int idCuenta, LocalDateTime fecha) {
		
		this.idMovimiento = idMovimiento;
		this.cantidad = cantidad;
		this.operacion = operacion;
		this.idCuenta = idCuenta;
		this.fecha = fecha;
	}
	public int getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
}
