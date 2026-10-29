// package com.lib.app.model;

// import com.lib.app.enums.CopyCondition;
// import com.lib.app.enums.CopyStatus;

// import java.time.LocalDate;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.Setter;

// @Entity 
// @AllArgsConstructor 
// @Getter 
// @Setter
// public class BookCopy {
//     @Id 
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long copyId;

//     private String Barcode;

//     private CopyStatus status;

//     private CopyCondition condition;

//     private String ShelfLocation;
    
//     private LocalDate acquiredOn;
// }
