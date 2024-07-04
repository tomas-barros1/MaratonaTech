import img from "../assets/img/icons/logo-byte-cafe.svg"
import "./Nav.css"

export default function Nav() {
  return (
    <nav>
      <img src={img} alt="img-logo" />
        <h1>Home</h1>
        <h1>Sobre</h1>
        <h1>Galeria</h1>
        <h1>Contato</h1>
    </nav>      
  )
}