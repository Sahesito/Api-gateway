## 🛡️ API Gateway – SmartCommerce
This module centralizes all incoming traffic to the SmartCommerce backend and ensures controlled, scalable communication between microservices.

## 🎯 Why This Module Exists
- Single Entry Point
  All client requests pass through one controlled layer, simplifying security, monitoring, and routing.

- Service Decoupling
  Frontend applications do not communicate directly with individual microservices. This prevents tight coupling and allows services to evolve independently.

- Dynamic Service Discovery
  Integrated with Eureka to automatically detect and route traffic to available service instances.

- Load Balancing
  Uses lb:// to distribute traffic across multiple instances of each service.

- Centralized CORS Management
  Handles cross-origin configuration globally, avoiding duplicated configuration across services.

- Clean Internal APIs
  Path rewriting keeps internal service endpoints simple and independent of public routing structure.

- Observability & Debugging
  Actuator endpoints (health, info, gateway) and DEBUG logging provide transparency and easier troubleshooting.

## 🌐 Main Routes
| Public Endpoint | Target Service    |
| --------------- | ----------------- |
| `/auth/**`      | Auth Service      |
| `/users/**`     | User Service      |
| `/products/**`  | Product Service   |
| `/inventory/**` | Inventory Service |
| `/orders/**`    | Order Service     |
| `/payments/**`  | Payment Service   |

## ⚙️ Base Configuration
- Port: 8080
- Registered in Eureka (http://localhost:8761)
- Service discovery enabled
- Global CORS configuration
- Gateway monitoring enabled
