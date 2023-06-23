package in.prashantpatil.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_book")
@Setter
@Getter
@ToString
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String sku;
	private String name; 
	private String description; 
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	private boolean active;
	
	@Column(name = "units_in_stock")
	private int unitsInStock ;
	
	@Column(name = "date_created")
	private Date dateCreated;
	
	@Column(name = "last_updated")
	private Date lastUpdated ; 
	
	@ManyToOne
	@JoinColumn(name = "category_id",nullable = false)
	private BookCategory category;
	
}
