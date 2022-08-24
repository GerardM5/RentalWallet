import React from "react";
import "./AppLayout.css";
export default function AppLayout({ children }) {
  return (
    <div className="container">
      <section className="leftSection">NAV</section>
      <section className="rightSection"> {children}</section>
    </div>
  );
}
