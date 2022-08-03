import React from 'react'
import "./Nav.css"
import {Link} from 'react-router-dom'
export default function Nav() {
 
  return (
    <nav className='container'>
        <div className='navSide' >
            <Link to ='/gerard'>
              logo
            </Link>
            
        </div>
        <div className='navSide'>
            usuario
        </div>
    </nav>
  )
}
