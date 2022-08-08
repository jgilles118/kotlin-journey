/*
 *	Kotlin Pointer Events
 *
 * */

 fun main() = singleWindowApplication{
	var isActivated by remember { mutableStateOf(false) }
	var isHovered by remember { mutableStateOf(false) }
	var size by animateDpAsState(if (isActivated) 300.dp else 200.dp)

	Box(
		Modifier

			.size(size)
			.background(if (isHovered) Color.Green else Color.Red)
			.onPointerEvent(PointerEventType.Enter) { isHovered = true }
			.onPointerEvent(PointerEventType.Exit) { isHovered = false }
			.onPointerEvent(PointerEventType.Press) {
				if (it.buttons.isPrimaryPressed) {
					isActivated = true
		
				} else if (it.buttons.isSecondaryPressed) {
					isActivated = false					
				}

			}//close PointerEvent Press

	)//close Box


 }//close main
