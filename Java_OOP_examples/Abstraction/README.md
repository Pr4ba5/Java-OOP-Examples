# 🎭 Java Abstraction

## 🔷 THE CONCEPT

Abstraction is the OOP concept of **hiding the complex implementation** details and showing only the **essential features** of an object.

Java achieves abstraction in two ways:
- Using **abstract classes**
- Using **interfaces** (more on this in the next section)

---

## 🧠 REAL-LIFE ANALOGY

Think of driving a car. You use the **steering wheel**, **accelerator**, and **brake**, but you don’t need to know **how** the engine or braking system works internally.

That’s abstraction — showing only **what is necessary**, hiding the **how**.

---

## ❓ WHEN AND WHY TO USE ABSTRACTION

Use abstraction when:
- You want to define a **template** or **blueprint** with some common logic but leave the detailed behavior to the subclasses.
- You want to **enforce a contract** for subclasses to implement specific behaviors.

---

## 🧠 QUICK NOTES

- Abstract classes **cannot be instantiated**.
- They can contain **both abstract and non-abstract methods**.
- Subclasses **must override** all abstract methods unless they are abstract themselves.

---

## ⚠️ COMMON PITFALLS / INTERVIEW QUESTIONS

- ❓ Can abstract classes have constructors?  
  ➤ Yes, they can (used in initialization).

- ❓ Can you have `final`, `static`, or `private` abstract methods?  
  ➤ No. Abstract methods must be `overridden`, so `private/final/static` doesn't make sense.

- ❓ How is abstraction different from encapsulation?  
  ➤ Abstraction hides **implementation**, encapsulation hides **data**.

---

📂 Find the working example in `AbstractionExample.java` in this folder.

