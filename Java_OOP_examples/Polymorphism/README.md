# 🔁 Java Polymorphism

## 🔷 THE CONCEPT

Polymorphism means "**many forms**". In Java, polymorphism allows objects to be treated as instances of their **parent class**, while still exhibiting **behavior/methods specific to their actual class**.


like we specified  **Inheritence** in previous part, which let use inherit the behavior and properties from parent class, now here comes the use of **Polymorphism**, it uses those methods to perform different task.This allows us to perform single action in different ways.

Java supports two types of polymorphism:
- **Compile-time (Static) Polymorphism** → achieved via **method overloading**
- **Runtime (Dynamic) Polymorphism** → achieved via **method overriding**

---

## 🧠 REAL-LIFE ANALOGY

Imagine a **remote control** that operates different devices — TV, AC, or a Music System.

Each device reacts differently when you press the **power button**, but you use the **same interface** (remote). That’s polymorphism in action.

---

## 📌 WHEN AND WHY TO USE POLYMORPHISM

Use polymorphism when:
- You want to **reuse a method name** for different purposes (overloading).
- You want **different objects to respond differently** to the same method call (overriding).
- You aim for **cleaner, more flexible, and scalable code**.



---

## 🆚 OVERLOADING vs OVERRIDING

| Feature         | Overloading                     | Overriding                           |
|----------------|----------------------------------|--------------------------------------|
| Type            | Compile-time                    | Runtime                              |
| Definition      | Same method name, different parameters | Same method signature, different behavior in subclass |
| Class Relation  | Same class                      | Parent-child classes                 |

---

## ⚠️ COMMON PITFALLS / INTERVIEW QUESTIONS

- ❓ Can static methods be overridden?  
  ➤ No. Static methods belong to the class, not the object.

- ❓ What happens if you forget `@Override`?  
  ➤ Java may not catch errors like mismatched method signatures.

- ❓ How does polymorphism help with scalability?  
  ➤ You can add new subclasses without changing existing logic that uses the parent type.

---

📂 Find full working code in `PolymorphismExample.java` in this folder.

