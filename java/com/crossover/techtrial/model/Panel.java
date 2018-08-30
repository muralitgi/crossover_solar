package com.crossover.techtrial.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;

/**
 * Panel class hold information related to a Solar panel.
 * 
 * @author Crossover
 *
 */
@Entity
@Table(name = "panel", uniqueConstraints = { @UniqueConstraint(columnNames = { "serial" }) })
public class Panel implements Serializable {

	private static final long serialVersionUID = -8527695980909864257L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@NotNull
	@Column(name = "serial", unique = true)
	@Size(min = 16, max = 16, message = "Serial number must be 16 chars.")
	String serial;

	@Column(name = "longitude")
	@Digits(integer = 2, fraction = 6, message = "Longitude must be 6 decimal places.")
	BigDecimal longitude;

	@Column(name = "latitude")
	@Digits(integer = 2, fraction = 6, message = "Latitude must be 6 decimal places.")
	BigDecimal latitude;

	@Nullable
	@Column(name = "brand")
	String brand;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/*
	 * Id, Serial and Brand are only fields required to uniquely identify a Panel
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((serial == null) ? 0 : serial.hashCode());
		return result;
	}

	/*
	 * Id, Serial and Brand are only fields required to uniquely identify a Panel
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Panel other = (Panel) obj;
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (serial == null) {
			if (other.serial != null) {
				return false;
			}
		} else if (!serial.equals(other.serial)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Panel [id=" + id + ", serial=" + serial + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", brand=" + brand + "]";
	}
}
