<p align="center">
  <img width="50%" height="50%" src="https://i.imgur.com/I1nYfFf.png">
  <br>
  <a><img alt="Server Version" src="https://img.shields.io/badge/Server%20Version-1.7.10%201.19.3-blue"></a>
  <a><img alt="Api Type" src="https://img.shields.io/badge/API-Bukkit-blue"></a>
  <a><img alt="Authors" src="https://img.shields.io/badge/Authors-Ghast-blue"></a>
  <a><img alt="Issues" src="https://img.shields.io/github/issues/artemisac/Artemis-Packet-API"></a>
  <a><img alt="Forks" src="https://img.shields.io/github/forks/artemisac/Artemis-Packet-API"></a>
  <a><img alt="Stars" src="https://img.shields.io/github/stars/artemisac/Artemis-Packet-API"></a>
</p>

This is a simplistic yet extremely efficient way to handle packets. Instead of relying on directly calling NMS packet via
reflections, this reads them the proper way. It allows for a quite noticeable performance boost and a whole lot more control.

This project was created for Artemis Anticheat, which can be seen @ https://artemis.ac. 

### Reasoning
When working on the Artemis project, the use of external libraries was against our ideal. We wanted to be as independent as one could be. 
However, as our tests percevered, we noticed a pattern: Packets were always an issue. Bottlenecking, wrong version, syntax errors... We were
always subject to a variety of issues related to packets and reflections. So we engineered a new packet api which would not require a single reflection
call in the handling process. This would noticeably improve performance and would extremely facilitate the process.

### Status
Near completed. The following needs to be done: 
- ~~Finish all NMS injectors~~
- Finish all packet wrappers, especially outbound
- ~~Handle SetProtocol packet properly~~
- ~~Add API to add external calls, similar to bukkit~~
- Document everything
- ~~Finish ChannelInjector hook to make sure it hooks before the correct pipeline handler~~
- Add some protection and timeout packet exploits
- Add some useful commands

### Credits
I'd like to credit 2-3 authors which's work made this possible. 

**[FormallyMyles](https://github.com/FormallyMyles)** - I'd like to thank you for open sourcing ViaVersion and making an extremely clear and well though system. 
My way of handling the structure of ByteBuf is extremely similar to yours. It's really clean in my opinion. Thank you

**[ElevatedDev](https://github.com/ElevatedDev)** - Thank you Elevated for giving me tips for here and there. The use of labels and some specific things are
all down to your work. I truly appreciate the help.

# License
All rights reserved - Ghast Holdings LLC

For any support concern, open an issue. If you'd like to see more fancy stuff, contact me on discord @ Ghast#0001
