package net.javaguides.springboot.springsecurity.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Venta {
	 public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String fechaYHora;
	    private String tipoDeEnvio;
	    private String formaDePago;

	    public String getTipoDeEnvio() {
			return tipoDeEnvio;
		}

		public void setTipoDeEnvio(String tipoDeEnvio) {
			this.tipoDeEnvio = tipoDeEnvio;
		}

		public String getFormaDePago() {
			return formaDePago;
		}

		public void setFormaDePago(String formaDePago) {
			this.formaDePago = formaDePago;
		}

		@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
	    private Set<ProductoVendido> productos;

		public Venta(String fechaYHora, String formaDePago, String tipoDeEnvio) {
	        this.fechaYHora = Utiles.obtenerFechaYHoraActual();
	        this.formaDePago = formaDePago;
	        this.tipoDeEnvio = tipoDeEnvio;
	    }
	    

	    public Integer getId() {
	        return id;
	    }

	    
		public void setId(Integer id) {
	        this.id = id;
	    }

	    public Float getTotal() {
	        Float total = 0f;
	        for (ProductoVendido productoVendido : this.productos) {
	            total += productoVendido.getTotal();
	        }
	        return total;
	    }
	    
	    public String getFechaYHora() {
	        return fechaYHora;
	    }

	    public void setFechaYHora(String fechaYHora) {
	        this.fechaYHora = fechaYHora;
	    }

	    public Set<ProductoVendido> getProductos() {
	        return productos;
	    }

	    public void setProductos(Set<ProductoVendido> productos) {
	        this.productos = productos;
	    }

}
