import React from "react";
import { FaSearch } from "react-icons/fa";
import "./SearchPart.css";
export default function SearchPart() {
  return (
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
  );
}
