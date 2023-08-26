import Express from 'express'
import http from 'http'
import {Server} from 'socket.io'

const app = Express
const httpServer = http.createServer(app)
const io = new Server(httpServer)

export {httpServer, io}
/*
var dadosChat = {
    url: "127.0.0.1",
    port: 3000, 
    sala: "default"
}



// iniciando WebSocket
let socket = () => {
    io.on("connection", (socket) => {
        console.log(socket.data)                 

        socket.onAny("sala", (event) => {
            console.log ("evento recebido") 
        })

    })
}
*/