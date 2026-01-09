# banking-architecture-whiteboard
# Banking Backend Architecture Exercise

This repository contains a **technical architecture exercise** designed for senior backend / architecture interviews in regulated environments (banking / fintech).

## Purpose

- Demonstrate architectural decision-making.
- Explain trade-offs in microservices and distributed systems.
- Show typical mistakes and correct approaches.
- Focus on traceability, auditability and reliability.

This is **not** a production system and **not** a functional banking product.

## Scope

- Architecture design.
- Domain separation.
- Event-driven considerations.
- Security and compliance reasoning.

## Out of scope

- Full implementation.
- UI.
- Infrastructure automation.

The goal is to explain **how to think**, not to deliver features.

## Repository Structure

banking-backend-architecture-exercise/
│
├── README.md
│
├── docs/
│   ├── 01_context_and_objective.md
│   ├── 02_bounded_contexts.md
│   ├── 03_transfer_flow.md
│   ├── 04_error_tracing.md
│   ├── 05_correct_tracing.md
│   ├── 06_error_domain_design.md
│   ├── 07_hexagonal_architecture.md
│   ├── 08_error_events.md
│   ├── 09_correct_events.md
│   ├── 10_security_considerations.md
│   ├── 11_testing_strategy.md
│   ├── 12_mockup_vs_production.md
│   └── 13_live_coding_guide.md
│
├── diagrams/
│   ├── architecture_overview.png
│   ├── transfer_flow.png
│   └── hexagonal_architecture.png
│
├── src/
│   └── main/
│       └── java/
│           └── com/example/bank/
│               ├── domain/
│               │   ├── account/
│               │   │   ├── Account.java
│               │   │   └── AccountId.java
│               │   ├── transfer/
│               │   │   ├── Transfer.java
│               │   │   └── TransferStatus.java
│               │   └── common/
│               │       └── CorrelationId.java
│               │
│               ├── application/
│               │   └── transfer/
│               │       └── CreateTransferUseCase.java
│               │
│               ├── infrastructure/
│               │   └── persistence/
│               │       └── TransferRepository.java
│               │
│               └── api/
│                   └── TransferController.java
│
└── pom.xml

src/main/java/com/example/bank/

├── domain/
│   ├── common/
│   │   └── CorrelationId.java
│   └── transfer/
│       ├── Transfer.java
│       ├── TransferId.java
│       ├── TransferStatus.java
│       ├── TransferCreatedEvent.java
│       └── TransferRepository.java
│
├── application/
│   └── transfer/
│       └── CreateTransferUseCase.java
│
├── infrastructure/
│   └── persistence/
│       └── InMemoryTransferRepository.java
│
└── api/
    └── TransferController.java
