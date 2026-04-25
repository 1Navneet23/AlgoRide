# 🚖 Cab Booking System — Java + DSA

A terminal-based Cab Booking System built entirely in Java, designed to practice and implement core Data Structures & Algorithms concepts in a real-world project context.

> Built as a learning project — every feature maps directly to a DSA concepts.

---

## 📌 About

This project simulates a cab booking backend — drivers, riders, city routes, ride matching, fare calculation, and surge detection — without any external libraries or frameworks. Just pure Java and DSA.

The goal was simple: instead of solving DSA problems in isolation, apply them inside a single cohesive project where each feature *needs* a specific data structure to work correctly.

---

## 🧠 DSA Concepts Used

| Data Structure / Algorithm | Where It's Used |
|---|---|
| `HashMap` | Driver, Rider, Trip storage — O(1) lookup |
| `ArrayList` | Graph edge lists, search results |
| `PriorityQueue` (Min-Heap) | Nearest driver matching, Dijkstra's algorithm |
| `PriorityQueue` (Max-Heap) | Driver leaderboard by rating |
| `Queue` (LinkedList) | Ride request waiting line, BFS traversal |
| `Stack` | Trip history per user, DFS traversal, undo |
| `Graph` (Adjacency List) | City road network |
| `Dijkstra's Algorithm` | Shortest route between locations |
| `BFS` | Reachable zones within X km, surge detection |
| `DFS` | All possible routes between two points |
| `Trie` | Location name auto-complete |
| `Comparable` + `Collections.sort` | Sort drivers by name or rating |

---

## 📁 Project Structure

```
CabBookingSystem/
│
├── Main.java              # CLI menu — entry point
├── Location.java          # Location model
├── Driver.java            # Driver model + trip history (Stack)
├── Rider.java             # Rider model + trip history (Stack)
├── Trip.java              # Trip model with status lifecycle
│
├── CabDatabase.java       # In-memory storage (HashMaps)
├── CityGraph.java         # Graph — adjacency list of locations & roads
├── RouteEngine.java       # Dijkstra + BFS + DFS implementations
├── RideManager.java       # Ride request queue + driver matching
├── Trie.java              # Trie for location auto-complete
├── TrieNode.java          # Trie node definition
├── FareEngine.java        # Fare calculation + surge multiplier
└── SurgeDetector.java     # BFS-based surge zone detection
```

---

## ⚙️ How to Run

**Requirements:** Java 8 or above

```bash
# Clone the repository
git clone https://github.com/1Navneet23/cab-booking-system.git
cd cab-booking-system

# Compile all files
javac *.java

# Run
java Main
```

---

## 🖥️ CLI Menu

```
=== CAB BOOKING SYSTEM ===
1.  Add Driver
2.  Add Rider
3.  Add Road Between Locations
4.  Request a Ride
5.  Match Next Ride
6.  Search Location (Auto-complete)
7.  Find Shortest Route
8.  View Driver Trip History
9.  Undo Last Trip
10. View Top Drivers
11. Check Surge Zones
0.  Exit
```

---

## 🗺️ How Each Feature Works

### 🔍 Route Finding
Three algorithms run on the same city graph:
- **Dijkstra** — finds the shortest (cheapest) path, used for fare calculation
- **BFS** — finds all locations reachable within a distance limit
- **DFS** — explores every possible route between two points

### 🚗 Ride Matching
Incoming ride requests join a `Queue`. Available drivers are ranked by their Dijkstra distance to the first rider in queue using a `PriorityQueue`. The nearest driver gets matched first. If two drivers are equidistant, the one with the higher rating wins.

### 📍 Auto-Complete
A `Trie` is built from all location names on startup. As you type a prefix, DFS on the Trie collects all matching location names instantly.

### 📊 Surge Detection
BFS is run from every location. If the number of pending riders within a set radius exceeds a threshold, that location is flagged as a surge zone and fare is multiplied by 1.5x.

### ↩️ Undo
Every driver and rider holds a `Stack<Trip>`. Adding a trip pushes to the stack. Undo simply pops the last entry — no complex logic needed.

---

## 📈 Stage-by-Stage Build Plan

This project was built in 10 stages, each focused on one layer:

| Stage | What | DSA |
|---|---|---|
| 1 | Data Models | Classes, OOP |
| 2 | Storage Layer | HashMap |
| 3 | City Graph | Graph, Adjacency List |
| 4 | Route Engine | Dijkstra, BFS, DFS |
| 5 | Ride Matching | Queue, PriorityQueue |
| 6 | Auto-Complete | Trie |
| 7 | Trip History & Undo | Stack |
| 8 | Fare & Ranking | Sorting, Comparable, Max-Heap |
| 9 | Surge Detection | BFS |
| 10 | CLI Menu | Everything wired together |

---

## 🙋 About Me

**Navneet Singh**
B.Tech — Artificial Intelligence & Data Science (2023–2027)
Pranveer Singh Institute of Technology, Kanpur

- 💼 [LinkedIn](https://linkedin.com/in/navneet-singh-4b5a9a398)
- 🐙 [GitHub](https://github.com/1Navneet23)
- 📧 2k23.aids2312419@gmail.com

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).
