// package com.lib.app.model;

// import java.time.LocalDate;

// import com.lib.app.enums.FineReason;
// import com.lib.app.enums.FineStatus;

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
// public class Fine {
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long fineId;

//     private Double amount;
//     private FineReason reason;
//     private LocalDate issuedOn;
//     private FineStatus status;
// }
