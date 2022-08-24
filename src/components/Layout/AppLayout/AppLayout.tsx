import React from "react";
import "./AppLayout.css";
import { FaSearch } from "react-icons/fa";

export default function AppLayout({ children }) {
  return (
    <div className="container">
      <section className="leftSection">NAV</section>
      <section className="rightSection">
        <nav className="navContainer">
          <div className="navRight">
            <div className="searchContainer">
              <input
                type="text"
                placeholder="Busca tu anuncio perfecto"
                className="inputSearch"
              />
              <button className="btnSearch">
                <span className="searchIcon">
                  <FaSearch />
                </span>
                <span className="searchText">Buscar</span>
              </button>
            </div>
          </div>
          <div className="navLeft">ICONS</div>
        </nav>
        {children}
      </section>
    </div>
  );
}
